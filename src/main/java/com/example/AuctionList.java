package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuctionList {
	@XmlElement
	public String id;
	@XmlElement
	public String name;
	
	public AuctionList(){}
	
	public AuctionList(String id, String name){
		this.id = id;
		this.name = name;
	}
}
