package com.java8.datetimeapi;

import java.time.Duration;
import java.time.Instant;

public class InstantImpl {

	public static void main(String[] args) {
		//Creation
		System.out.println();
		Instant instant = Instant.ofEpochSecond(0);
		System.out.println("Instant of EpochDay !! " +instant);
		
		Instant instant2 = Instant.now();
		System.out.println("Instant of EpochDay !! " + instant2);
		System.out.println("Instant of EpochDay to seconds !! " + instant2.getEpochSecond());

		//Comparing Two Instant
		System.out.println();
		System.out.println("Comparing Two Instant!! ");
		Duration between = Duration.between(instant, instant2);
		System.out.println("Comparing Two Instant!! "+ between.getSeconds());
		System.out.println("Comparing Two Instant!! "+ between.toDays());
	}

}
