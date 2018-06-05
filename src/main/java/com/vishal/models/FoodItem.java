package com.vishal.models;

public class FoodItem extends Item {

	Long expiryTime;

	public boolean isReturnAccepted() {
		return false;
	}
	
	public boolean isExchangeAccepted() {
		return false;
	}
}
