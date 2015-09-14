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
	@Produces("application/json")
	public AuctionList getAuctionList(
			@DefaultValue("") @QueryParam("token") String token,
			@DefaultValue("") @QueryParam("userid") String userID,
			@DefaultValue("0") @QueryParam("minprice") int minPrice,
			@DefaultValue("10000000") @QueryParam("maxprice") int maxPrice,
		    @DefaultValue("0") @QueryParam("categoryID") int categoryID){
		return new AuctionList("a00001", "This is Auction List");
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
