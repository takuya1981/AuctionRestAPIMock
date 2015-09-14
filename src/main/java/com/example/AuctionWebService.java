package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Auction Web Service
 */
@Path("AuctionWebService")
public class AuctionWebService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Get it!";
	}
	
	@Path("GetItems")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String GetItems(){
		return "Items";
	}
}
