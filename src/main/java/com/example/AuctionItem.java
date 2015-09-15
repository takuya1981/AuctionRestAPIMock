package com.example;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuctionItem {
	public String auctionID;			// 商品(オークション)のID
	public String categoryID;			// カテゴリのID
	public String title;				// 商品のタイトル
	public String seller;				// 出品者
	public String sellerID;				// 出品者のID
	public int currentPrice;			// 現在価格
	public int bidsCount;				// 現在の入札数
	public String endDate;				// 終了予定時刻
	
	public AuctionItem(){
		this("", "", "", "", "", 0, 0, "");
	}
	
	public AuctionItem(String auctionID, String categoryID, String title, String seller, String sellerID, int currentPrice, int bidsCount, String endDate){
		this.auctionID = auctionID;
		this.categoryID = categoryID;
		this.title = title;
		this.seller = seller;
		this.sellerID = sellerID;
		this.currentPrice = currentPrice;
		this.bidsCount = bidsCount;
		this.endDate = endDate;
	}
}
