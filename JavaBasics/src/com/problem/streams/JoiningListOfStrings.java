package com.problem.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningListOfStrings {

	public static void main(String[] args) {

		// Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
		// Given a list of strings, write a Java 8 program to join the strings with '['
		// as a prefix, ']' as a suffix, and ',' as a delimiter.

		List<String> listStr = List.of("sathya", "priya", "Arun", "jeeva", "Kumar");
		join(listStr);

		// Find the maximum and minimum of a list of integers and others
		// Given a list of integers, write a Java 8 program to find the maximum and
		// minimum numbers in the list.

		List<Integer> listInt = List.of(1, 4, 5, 3, 66, 7, 56, 8, 9, 0, 9, 3, 4, 6, 55, 254, 7);
		summaraizingInt(listInt);
	}

	private static void summaraizingInt(List<Integer> listInt) {
		
		// Collectors.summarizingInt - using this we can get max , min , sum, count,
		// average
		IntSummaryStatistics collect = listInt.stream().collect(Collectors.summarizingInt(i -> i));
		System.out.println("Average: " + collect.getAverage());
		System.out.println("Count: " + collect.getCount());
		System.out.println("Max:" + collect.getMax());
		System.out.println("Min: " + collect.getMin());
		System.out.println("Sum: " + collect.getSum());
	}

	private static void join(List<String> listStr) {
		String sentance = listStr.stream().collect(Collectors.joining(" ", "{ ", " }"));
		System.out.println("sentance: " + sentance);
	}
}
