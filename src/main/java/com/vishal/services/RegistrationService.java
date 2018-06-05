package com.vishal.services;

import com.vishal.models.CreditcardPaymentDetails;
import com.vishal.models.PaymentDetails;
import com.vishal.models.PaypalPaymentDetails;
import com.vishal.models.User;

public class RegistrationService {

	public User registerNewUser(String firstName, String lastName, String userName, String password) {

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUserName(userName);
		user.setPassword(password);

		user.setId("some random id");

		// save to database

		return user;

	}

	public PaymentDetails addPaymentDetails(String paymentType, String cardNo, String paypalUserName,
			String paypalPassword) {
		if ("CREDIT_CARD".equals(paymentType)) {
			CreditcardPaymentDetails p = new CreditcardPaymentDetails();
			p.setCreditCardNo(cardNo);
			return p;
		} else {
			PaypalPaymentDetails p = new PaypalPaymentDetails();
			p.setPassword(paypalPassword);
			p.setUserName(paypalUserName);
			return p;
		}
	}
}
