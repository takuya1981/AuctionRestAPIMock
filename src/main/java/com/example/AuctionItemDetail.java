package com.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuctionItemDetail {
	public String auctionID;			// 商品(オークション)のID
	public String categoryID;			// カテゴリのID
	public String title;				// 商品のタイトル
	public String seller;				// 出品者
	public String sellerID;				// 出品者のID
	public int startPrice;				// 開始価格
	public int currentPrice;			// 現在価格
	public int reservePrice;			// 最低落札価格
	public int bidOrBuy;				// 即決価格
	public int bidsCount;				// 現在の入札数
	public String startDate;			// 開始日時
	public String endDate;				// 終了予定時刻
	public String itemStatus;			// 商品状態(新品, 中古, その他)
	public String comment;				// 商品コメント
	public Boolean returnable;			// 返品可否
	public String highestBidder;		// 最高額入札者
	public String highestBidderID;		// 最高額入札者のID
	public String status;				// オークションの状態(出品中, 終了, オークションの取り消し)
	
	public AuctionItemDetail(){
		this("", "", "", "", "", 0, 0, 0, 0, 0, "", "", "", "", false, "", "", "");
	}
	
	// TODO コンストラクタ長すぎるのでBuilderなどで必須項目とそうでないものを分ける
	public AuctionItemDetail(String auctionID, String categoryID, String title, String seller, String sellerID, int startPrice, int currentPrice, int reservePrice, int bidOrBuy, int bidsCount, String startDate, String endDate, String itemStatus, String comment, Boolean returnable, String highestBidder, String highestBidderID, String status){
		this.auctionID = auctionID;
		this.categoryID = categoryID;
		this.title = title;
		this.seller = seller;
		this.sellerID = sellerID;
		this.startPrice = startPrice;
		this.currentPrice = currentPrice;
		this.reservePrice = reservePrice;
		this.bidOrBuy = bidOrBuy;
		this.bidsCount = bidsCount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.itemStatus = itemStatus;
		this.comment = comment;
		this.returnable = returnable;
		this.highestBidder = highestBidder;
		this.highestBidderID = highestBidderID;
		this.status = status;
	}
}
