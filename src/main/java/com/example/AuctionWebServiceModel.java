package com.example;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;


public class AuctionWebServiceModel {
	// TODO 引数を受け取ってクエリを構築
	public AuctionItemList getAuctionItemList()
	{
		// TODO token, userIDのチェック		
		AuctionItemList list = new AuctionItemList(100, 10, 1);
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tbl");
			while(rs.next()){
				list.items.add(new AuctionItem(rs.getString(1), rs.getString(2), 
						rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(7), 
						rs.getInt(10), rs.getString(12)));
			}
		} catch (URISyntaxException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return list;
	}
	
	public AuctionItemDetail getAuctionItemDetail(String auctionID)
	{
		// TODO token, userIDのチェック
		AuctionItemDetail item = null;
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tbl WHERE auction_id = '" + auctionID + "'");
			while(rs.next()){
				item = new AuctionItemDetail(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), 
						rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getBoolean(15), 
						rs.getString(16), rs.getString(17), rs.getString(18));
			}
		} catch (URISyntaxException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return item;
	}
	
	public int registerAuctionItem(String userID, String user, String categoryID, String title, int startPrice, int reservePrice, int bidOrBuy, String startDate, String endDate, String itemStatus, String comment, Boolean returnable)
	{
		// TODO token, userIDのチェック
		// TODO 引数のデータをチェック
		try {
			String auctionID = String.valueOf((int)(Math.random() * 10000000));
			
			Connection con = getConnection();
	        Statement stmt = con.createStatement();
	        stmt.executeUpdate("INSERT INTO tbl " + 
	        		"(auction_id, category_id, title, seller, seller_id, start_price, current_price, " +
	        		"reserve_price, big_or_buy, bids_count, start_date, end_date, item_status, comment, " +
	        		"returnable, highest_bidder, highest_bidder_id, status)" + 
	        		"VALUES('" + auctionID  +"', '" + categoryID + "', '" + title + "', '" + user +  "', '" + userID +
	        		"', '" + startPrice + "', '" + startPrice + "', '" + reservePrice + "', '" + bidOrBuy + "', '0'" + 
	        		"', '" + startDate + "', '" + endDate + "', '" + itemStatus + "', '" + comment + "', '" + returnable.toString() + 
	        		"', '', '', '出品中'");  
		} catch (URISyntaxException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateBidder(String userID, String user, String auctionID, String bidPrice)
	{
		// TODO token, userIDのチェック
		// TODO 引数のデータをチェック
		try {
			// auctionIDをkeyにbidPriceとhighestUserを更新する
			Connection con = getConnection();
	        Statement stmt = con.createStatement();
	        stmt.executeUpdate("UPDATE tbl SET highest_bidder_id = '" + userID + 
	        		"', highest_bidder = '" + user + "', current_price = '" + bidPrice + 
	        		"' WHERE auction_id = '" + auctionID + "'");
		} catch (URISyntaxException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}
	
    private static Connection getConnection() throws URISyntaxException, SQLException {
        URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath();

        return DriverManager.getConnection(dbUrl, username, password);
    }
}
