package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuctionList {
	public String id;
	public String name;
	public List<AuctionItem> items;
	
	public AuctionList(){}
	
	public AuctionList(String id, String name){
		this.id = id;
		this.name = name;
		items = new ArrayList<>();
	}
}
