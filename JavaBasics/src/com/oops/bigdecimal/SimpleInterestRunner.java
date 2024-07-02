package com.oops.bigdecimal;

public class SimpleInterestRunner {
	public static void main(String[] args) {

	
	SimpleInterest calculator = new SimpleInterest("4500.00","7.5");
	System.out.println(calculator.calculateTotalValue(5));
	}
}
