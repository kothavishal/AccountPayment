package com.vishal.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.vishal.models.User;

public class RegistrationServiceTest {

	RegistrationService registrationService;

	@Before
	public void setUp() {
		registrationService = new RegistrationService();
	}

	@Test
	public void testRegisterNewUser() {
		User u = registrationService.registerNewUser("vishal", "kotha", "kothavishal", "12345");
		Assert.assertNotNull(u);
		Assert.assertEquals(u.getFirstName(), "vishal");
		Assert.assertEquals(u.getLastName(), "kotha");
		Assert.assertEquals(u.getUserName(), "kothavishal");
		Assert.assertEquals(u.getPassword(), "12345");

	}
}
