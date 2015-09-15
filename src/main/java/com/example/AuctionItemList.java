package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuctionItemList {
	public int totalResultsAvailable;
	public int totalResultsReturned;
	public int totalResultPosition;
	public List<AuctionItem> items;
	
	public AuctionItemList(){ this(0,0,0); }
	
	public AuctionItemList(int totalResultsAvailable, int totalResultsReturned, int totalResultPosition){
		this.totalResultsAvailable = totalResultsAvailable;
		this.totalResultsReturned = totalResultsReturned;
		this.totalResultPosition = totalResultPosition;
		items = new ArrayList<>();
	}
}
