package com.vishal.models;

public class CreditcardPaymentDetails extends PaymentDetails {

	private String creditCardNo;

	private String expiryDate;

	private String cvv;

	public boolean chargePayment(){
		
		//write code to charge credit card
		return true;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
