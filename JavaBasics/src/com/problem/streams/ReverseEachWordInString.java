package com.problem.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		// Reverse each word of a string using Java 8 streams
		// Write a Java 8 program to reverse each word of a given string using the
		// stream API and lambda expressions.
		String s = "this is sathya priya";
		reverseTheStringUsingStringBuffer(s);
		
		int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("original array" + Arrays.toString(numberArray));
		reverseListOfIntUsingMap(numberArray);
	}

	private static void reverseListOfIntUsingMap(int[] numberArray) {
		int[] reversedArray = IntStream.rangeClosed(1, numberArray.length)
				.map(number -> numberArray[numberArray.length - number]).toArray();
		System.out.println("reversedArray Array" + Arrays.toString(reversedArray));
	}

	private static void reverseTheStringUsingStringBuffer(String s) {

		// Using stringBuffer to reverse because normal String doesn't have reverse
		// method
		// we can use stringBuilter also
		String reverseString = Arrays.stream(s.split(" ")).map(str -> new StringBuffer(str).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("reverseString: " + reverseString);
	}

}
