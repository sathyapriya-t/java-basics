package com.problem.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingCountOfEachCharInString {

	public static void main(String[] args) {
		
		String s = "sathyaArun";
		
		// Write a program to print the count of each character in a String?
		// Arrays.stream -is used to make an Array into a stream of values
		Map<String, Long> result = Arrays.stream(s.split("")).map(val -> val.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("result: " + result);
	}

}
