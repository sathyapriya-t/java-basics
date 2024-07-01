package com.problem.streams;

import java.util.List;

public class FindingFirstValueInList {

	public static void main(String[] args) {
		// Given the list of integers,
		// find the first element of the list using Stream functions?
		List<Integer> list = List.of(12, 45, 11, 34, 5, 6, 8, 12, 4, 5);
		findFirst(list);
		findFirstWithIfpresent(list);

	}

	private static void findFirst(List<Integer> list) {
		Integer firstValue = list.stream().findFirst().orElse(0);
		System.out.println("firstValue: " + firstValue);
	}

	private static void findFirstWithIfpresent(List<Integer> list) {
		list.stream().findFirst().ifPresent(System.out::println);

	}

}
