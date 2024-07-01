package com.problem.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumElementInList {
	public static void main(String[] args) {
		// Given a list of integers,
		// find the maximum value element present in it using Stream functions?
		List<Integer> list = List.of(12, 45, 11, 34, 5, 6, 8, 12, 4, 5);
		findingMaxUsingSorted(list);
		maxVal(list);
		findingMaxValueUsingMapToLong(list);
		findingMaxValueUsingComparator(list);

	}

	private static void findingMaxValueUsingComparator(List<Integer> list) {
		//.max(Integer::compareTo) - means .max((i,j)-> i.compareTo(j))
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		System.out.println("Max: "+max.get());
	}

	private static void findingMaxValueUsingMapToLong(List<Integer> list) {
		long max = list.stream().mapToLong(i -> i).max().getAsLong();
		System.out.println("max: "+max);
	}

	private static void maxVal(List<Integer> list) {
		Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		System.out.println("Max Value: "+max.get());
	}

	private static void findingMaxUsingSorted(List<Integer> list) {
		Integer max = list.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(0);
		System.out.println("Max: "+ max);
	}

}
