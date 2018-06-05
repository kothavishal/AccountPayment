package com.vishal.services;

import java.util.List;

import com.vishal.models.Item;
import com.vishal.models.Order;

public class OrderService {

	public Order createOrder(List<Item> items) {

		Order o = new Order();

		return o;
	}

	public void addItemsToOrder(Item i, Order o) {

	}

	public boolean isOrderReturnAccepted(Order o) {
		for (Item i : o.getItems()) {
			if (!i.isReturnAccepted()) {
				return false;
			}
		}
		return true;
	}
}
