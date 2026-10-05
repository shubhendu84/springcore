package com.kk.springprimitiveDI.beans;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractBank implements Bank {

	boolean validateKYC(Customer c) {
		// common validation logic
		return "Laxman".equals(c.getName()) ? true : false;
	}

	String generateAccountNo() {
		// common logic to generate acc no

		long randomNumber = ThreadLocalRandom.current().nextLong(1000000000L, 10000000000L);

		return "SB" + randomNumber;
	}
}
