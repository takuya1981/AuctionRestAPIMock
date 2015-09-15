package com.example;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;

public class AuctionWebServiceModel {
	public AuctionItemList getAuctionItemList()
	{
		AuctionItemList list = new AuctionItemList();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tbl");
			while(rs.next()){
				list.items.add(new AuctionItem(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(7), rs.getInt(10), rs.getString(12)));
			}
		} catch (URISyntaxException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return list;
	}
	
	public AuctionItemDetail getAuctionItemDetail()
	{
		AuctionItemDetail item = new AuctionItemDetail();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
	        stmt.executeUpdate("UPDATE");
		} catch (URISyntaxException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return item;
	}
	
	public int registerAuctionItem()
	{
		try {
			Connection con = getConnection();
		} catch (URISyntaxException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateBidder(String token, String userID, String auctionID, String bidPrice)
	{
		try {
			// TODO token, userIDのチェック
			// TODO 引数のデータをチェック
			
			// TODO auctionIDをkeyにbidPriceとhighestUserを更新する
			Connection con = getConnection();
			
	        Statement stmt = con.createStatement();
	        stmt.executeUpdate("UPDATE");
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
