package problem.streams;

import java.util.Arrays;
import java.util.List;

public class StringStartsWithNumber {

	public static void main(String[] args) {
		// Find strings in a list that start with a number
		// Given a list of strings, write a Java 8 program to find the strings that
		// start with a number.
		List<String> list = Arrays.asList("sathya", "1priya", "1Arun");
		stringStartsWithDigit(list);

	}

	private static void stringStartsWithDigit(List<String> list) {
		List<String> listStartsWithDigit = list.stream().filter(str -> Character.isDigit(str.charAt(0))).toList();
		System.out.println("listStartsWithDigit: " + listStartsWithDigit);
	}

}
