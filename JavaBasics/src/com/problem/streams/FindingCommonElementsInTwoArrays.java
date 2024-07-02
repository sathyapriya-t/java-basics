package com.problem.streams;

import java.util.Arrays;
import java.util.List;

public class FindingCommonElementsInTwoArrays {

	public static void main(String[] args) {
		// Find the common elements between two arrays
		// Write a Java 8 program to find the common elements between two arrays using
		// streams.
		List<Integer> list = Arrays.asList(1, 45, 6, 7, 9, 8, 45, 5, 23);
		List<Integer> list2 = Arrays.asList(1, 45, 6, 7, 9, 8, 45, 5, 23, 67, 54);
		commonValueFromTwoList(list, list2);
		commonElementsInList(list, list2);

	}

	private static void commonElementsInList(List<Integer> list, List<Integer> list2) {
		list.retainAll(list2);
		System.out.println("commonList: " + list);
	}

	private static void commonValueFromTwoList(List<Integer> list, List<Integer> list2) {
		List<Integer> commonList = list2.stream().filter(list::contains).toList();
		System.out.println("commonList: " + commonList);
	}

}
