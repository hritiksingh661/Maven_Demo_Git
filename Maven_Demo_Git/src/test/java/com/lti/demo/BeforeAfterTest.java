package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class BeforeAfterTest {
	
	Calculator c = new Calculator();
	int sum;
	
	@BeforeAll  //static is compulsory in before all
	public static void testDBConn() {
		System.out.println("Data base up");
	}
	
	@AfterAll
	public static void testDBConn1() {
		System.out.println("Data base closed");
	}

	@BeforeEach
	public void testStartUp() {
		sum=0;
		System.out.println("sum is 0");
	}
	
	@AfterEach
	public void testShutDown() {
		sum=0;
		System.out.println("Shut Down sum=0");
	}
	
	@Test
	public void testAdd() {

		sum = c.add(100, 200);
		// expecting, actual, message
		Assertions.assertEquals(300, sum, "checked add msethod");
	}
	@Test
	public void testAdd1() {

		sum = c.add(100, 200);
		// expecting, actual, message
		Assertions.assertEquals(300, sum, "checked add method");
	}
	

}
