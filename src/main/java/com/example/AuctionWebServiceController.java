package com.example;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Auction Web Service Controller
 */
@Path("AuctionWebService/v1")
public class AuctionWebServiceController {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Get it!";
	}
	
	@Path("AuctionItemList.json")
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public AuctionItemList getAuctionItemList(
			@QueryParam("token") String token,
			@QueryParam("userid") String userID,
		    @QueryParam("categoryID") int categoryID,
			@DefaultValue("0") @QueryParam("minprice") int minPrice,
			@DefaultValue("10000000") @QueryParam("maxprice") int maxPrice,
		    @DefaultValue("0") @QueryParam("page") int page,
		    @DefaultValue("0") @QueryParam("itemStatus") String itemStatus){
		// TODO token, userIDのチェック
		// TODO 引数を基にデータを取得
		
		AuctionWebServiceModel model = new AuctionWebServiceModel();
		return model.getAuctionItemList();
	}
	
	@Path("AuctionItemDetail.json")
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public AuctionItemDetail getAuctionItemDetail(
			@DefaultValue("") @QueryParam("token") String token,
			@DefaultValue("") @QueryParam("userid") String userID,
			@DefaultValue("0") @QueryParam("auctionID") String auctionID){
		// TODO token, userIDのチェック
		// TODO auctionIDを基にデータを取得
		
		AuctionWebServiceModel model = new AuctionWebServiceModel();
		return model.getAuctionItemDetail(auctionID);
	}
	
	@Path("AuctionItem")
	@POST
	public void postAuctionItem(
			@QueryParam("token") String token,
			@QueryParam("userid") String userID,
			@QueryParam("categoryID") String categoryID,
			@QueryParam("title") String title,
			@QueryParam("startPrice") int startPrice,
			@QueryParam("reservePrice") int reservePrice,
			@QueryParam("bidOrBuy") int bidOrBuy,
			@QueryParam("startDate") String startDate,
			@QueryParam("endDate") String endDate,
			@QueryParam("itemStatus") String itemStatus,
			@QueryParam("comment") String comment,
			@QueryParam("returnable") Boolean returnable){
		// TODO token, userIDのチェック
		// TODO 引数のデータをチェック
		// TODO 引数のデータを登録
	}
	
	@Path("AuctionBid")
	@PUT
	public void putAuctionBid(
			@QueryParam("token") String token,
			@QueryParam("userid") String userID,
			@QueryParam("auctionID") String auctionID,
			@QueryParam("bidPrice") String bidPrice){
		AuctionWebServiceModel model = new AuctionWebServiceModel();
		model.updateBidder(token, userID, auctionID, bidPrice);
	}
}
