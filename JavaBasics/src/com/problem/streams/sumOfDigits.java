package com.problem.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sumOfDigits {

	public static void main(String[] args) {

		// Find the sum of all digits of a number in Java 8
		int digit = 123;
		sumOfDigitUsingStringArray(digit);
		sumOfDigitUsingStringArray(1234);
		
		sumOfDigitUsingCharacterGetNumericValue(digit);
		sumOfDigitUsingCharacterGetNumericValue(1234);
		
		sumUsingMapToInt(digit);
		sumUsingMapToInt(1234);

	}

	private static void sumUsingMapToInt(int digit) {
		// mapToInt(Integer::parseInt) -> takes stream of string,
		// Integer::parseInt -> converts string to Integer,
		// mapToInt -> converts the Integer to IntStream
		int sum = Arrays.stream(String.valueOf(digit).split("")).mapToInt(Integer::parseInt).sum();
		System.out.println("sum: " + sum);
	}

	private static void sumOfDigitUsingCharacterGetNumericValue(int digit) {
		// char() -> will give intstream of char values
		// Character::getNumericValue -> will retun the numeric value of the char
		int sum = String.valueOf(digit).chars().map(Character::getNumericValue).sum();
		System.out.println("sum: " + sum);
	}

	private static void sumOfDigitUsingStringArray(int digit) {
		String[] split = String.valueOf(digit).split("");
		Integer sum = Arrays.stream(split).collect(Collectors.summingInt(i -> Integer.valueOf(i)));
		System.out.println("sum: " + sum);
	}
}
