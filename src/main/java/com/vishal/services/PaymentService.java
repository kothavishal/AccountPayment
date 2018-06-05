package com.vishal.services;

import java.util.*;

import com.vishal.models.Item;
import com.vishal.models.Order;

public class PaymentService {

	public Double calculateTotalPrice(Order o) {
		Double res = 0.0d;
		List<Item> items = o.getItems();
		for (Item i : items) {
			res += i.getPrice();
		}

		return res;

	}
}
