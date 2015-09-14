package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Auction Web Service
 */
@Path("auctionwebservice")
public class AuctionWebService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getItems() {
		return "Items!";
	}
}
