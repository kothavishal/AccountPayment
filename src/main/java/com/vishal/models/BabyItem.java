package com.vishal.models;

public class BabyItem extends Item {
	
	AgeRange ageRange;
	
	public boolean isReturnAccepted() {
		return false;
	}
	
	public boolean isExchangeAccepted() {
		return true;
	}

}
