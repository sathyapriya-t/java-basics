package com.problem.streams;

import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWithOne {

	public static void main(String[] args) {
		// Given a list of integers,
		// find out all the numbers starting with 1 using Stream functions?
		List<Integer> list = List.of(12, 45, 11, 34, 5, 6, 8, 12, 4, 5);
		numberStartWithNumbeUsingStringMethod(list, "1");
		numberStartsWithNumberUsingAdditionOperator(list, "4");

	}

	private static void numberStartsWithNumberUsingAdditionOperator(List<Integer> list, String specifier) {
		List<String> valueList = list.stream().map(val -> val + "").filter(str -> str.startsWith(specifier))
				.collect(Collectors.toList());
		System.out.println("filteredList: " + valueList);
	}

	private static void numberStartWithNumbeUsingStringMethod(List<Integer> list, String specifier) {
		List<Integer> filteredList = list.stream().filter(num -> String.valueOf(num).startsWith(specifier))
				.collect(Collectors.toList());
		System.out.println("filteredList: " + filteredList);
	}

}
