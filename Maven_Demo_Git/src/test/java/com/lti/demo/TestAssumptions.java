package com.lti.demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
//Additional support while executing
//A failed Assumption leads to test termination

class TestAssumptions {
	
	
	@Test
	void testOnDev() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), TestAssumptions::message);
		System.out.println(" continue execution");
		
	}

	
	@Test
	void testOnProd() {
		System.setProperty("ENV", "PROD");
		Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")), TestAssumptions::message);
		System.out.println(" don't continue execution");
	}

	private static String message() {
		return "TEST Execution Failed :: ";
	}

}
