package com.example;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuctionItem {
	public String auctionID;
	public String categoryID;
	public String title;
	public String seller;
	public String sellerID;

	public AuctionItem(){}
	
	public AuctionItem(String auctionID, String categoryID, String title, String seller, String sellerID){
		this.auctionID = auctionID;
		this.categoryID = categoryID;
		this.title = title;
		this.seller = seller;
		this.sellerID = sellerID;
	}
}
