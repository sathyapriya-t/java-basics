package com.problem.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FindTotalNumberOfElements {
	public static void main(String[] args) {
		//Given a list of integers,
		//find the total number of elements present in the list using Stream functions?

		List<Integer> list = List.of(12, 45, 11, 34, 5, 6, 8, 12, 4, 5);
		size(list);
		findSizeUsingCollectors(list);
	}

	private static void size(List<Integer> list) {
		long count = list.stream().count();
		System.out.println("count: "+ count);
	}
	private static void findSizeUsingCollectors(List<Integer> list) {
		long count = list.stream().collect(Collectors.counting());
		System.out.println("count: "+ count);
	}

}
