package com.problem.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementInList {

	public static void main(String[] args) {

		// Find the most repeated element in an array
		// Write a Java 8 program to find the most repeated element in an array.
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 3, 6, 7, 8);
		List<Integer> list1 = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 6, 3, 6, 7, 8);
		mostRepeatedValueUsingCounting(list);
		mostRepeatedValueUsingCounting(list1);
		mostRepeatedValue(list);
	}

	private static void mostRepeatedValue(List<Integer> list) {
		
		Integer result = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().max(Comparator.comparingLong(Entry::getValue)).get().getKey();
		System.out.println("result: " + result);
	}

	private static void mostRepeatedValueUsingCounting(List<Integer> list) {

		// Counting the values and comparing to get the max value
		Optional<Integer> mostRepeatedValue = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Comparator.comparingLong(val -> val.getValue())).map(val -> val.getKey());
		System.out.println("Most Repeated Value: " + mostRepeatedValue.get());
	}

}
