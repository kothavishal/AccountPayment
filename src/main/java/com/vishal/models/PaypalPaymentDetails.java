package com.vishal.models;

public class PaypalPaymentDetails extends PaymentDetails {

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String userName;

	private String password;

	public boolean chargePayment() {

		// write code to charge credit card
		return true;
	}

}
