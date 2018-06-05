package com.vishal.models;

public abstract class Item {

	private Double price;
	
	private String id;
	
	public abstract boolean isReturnAccepted();
	
	public abstract boolean isExchangeAccepted();
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
