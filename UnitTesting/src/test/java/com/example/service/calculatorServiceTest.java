package com.example.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class calculatorServiceTest {
	
	@BeforeAll
	public static void init() {
		System.out.println("executed first before all test cases!");
	}
	
	@BeforeEach
	public void each() {
		System.out.println("executed before each test cases!");
	}


	@Test
	@Disabled
	public void addTest() {
		System.out.println("First test case!");
		int ans = calculatorService.add(12, 5);
		int expected=17;
		
		Assertions.assertEquals(expected, ans, "test failed");
	}
	
	
	@Test
	public void divideTest() {
		System.out.println("Second test case!");
		double ans = calculatorService.divide(12, 3);
		double expected=4;
		
		Assertions.assertEquals(expected, ans, "test failed");
	}
}
	