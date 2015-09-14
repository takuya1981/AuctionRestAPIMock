package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Auction Web Service
 */
@Path("AuctionWebService/v1")
public class AuctionWebServiceController {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Get it!";
	}
	
	@Path("json/AuctionList")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public AuctionList getAuctionList(
			@DefaultValue("") @QueryParam("token") String token,
			@DefaultValue("") @QueryParam("userid") String userID,
			@DefaultValue("0") @QueryParam("minprice") int minPrice,
			@DefaultValue("10000000") @QueryParam("maxprice") int maxPrice,
		    @DefaultValue("0") @QueryParam("categoryID") int categoryID){
		AuctionList list = new AuctionList(10, 2, 1);
		list.items.add(new AuctionItem("0001", "010", "攻殻機動隊 STAND ALONE COMPLEX", "サトウ", "satou1990", 8000, 2, "2015-09-21T12:00:00+12:00"));
		list.items.add(new AuctionItem("0002", "010", "スラムダンク DVD-BOX全巻", "スズキ", "axel0088", 37500, 7, "2015-12-01T12:00:00+09:00"));
		return list;
	}
	
	@Path("json/AuctionItem")
	@PUT
	public void putAuctionItem(){
		
	}
	
	@Path("json/AuctionBid")
	@PUT
	public void putAuctionBid(){
		
	}
}
