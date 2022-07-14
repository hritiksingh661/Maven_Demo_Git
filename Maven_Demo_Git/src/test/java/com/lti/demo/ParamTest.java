package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParamTest {// Parameterized

	@Disabled
	@ParameterizedTest
	@ValueSource(ints = { 8, 10, 20, -50, 100 })
	public void testArrays(int arg) {
		System.out.println("arg :" + arg);
		Assertions.assertTrue(arg % 2 == 0);
	}

	//@Disabled
	@ParameterizedTest
	@DisplayName("Sholuld pass all non null arguments to the methods")
	@ValueSource(strings = { "Hello", "Hello World"})
	public void testParam(String msg) {
		String searchKey = "Hello";
		Assertions.assertTrue(msg.contains(searchKey));
	}

	@Disabled
	@RepeatedTest(3)
	public void shouldRepeat() {
		int x = 100;
		int y = 2;
		Assertions.assertEquals(200, x * y);
	}

	// Junit 5 supports lambda functions

	@Disabled
	@Test
	void testExceptions() {
		Assertions.assertThrows(NumberFormatException.class, () -> {
			Integer.parseInt("One");
		});
	}

}
