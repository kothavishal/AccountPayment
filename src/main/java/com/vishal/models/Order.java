package com.vishal.models;

import java.util.List;

public class Order {

	private List<Item> items;
	
	private User user;
	
	private PaymentDetails paymentDetails;
	
	private Double totalPrice;

	/**
	 * Example of polymorphism
	 */
	public boolean isOrderReturnAccepted(Order o) {
		for (Item i : o.getItems()) {
			if (!i.isReturnAccepted()) {
				return false;
			}
		}
		return true;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
