package com.problem.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindingOnlyDuplicateElementsInList {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 45, 11, 34, 5, 6, 8, 12, 4, 5);

		findingOnlyDuplicateElemetsUsingCollections(list);
		findingOnlyDuplicateElemetsUsingCollectionsWithDistinct(list);
	}

	private static void findingOnlyDuplicateElemetsUsingCollectionsWithDistinct(List<Integer> list) {
		List<Integer> duplicateList = list.stream().filter(val -> Collections.frequency(list, val)>1)
				.collect(Collectors.toList()).stream().distinct().toList();
		System.out.println("duplicateList using Collection.frequescy with distint value: "+ duplicateList);		
	}

	private static void findingOnlyDuplicateElemetsUsingCollections(List<Integer> list) {
		List<Integer> duplicateList = list.stream().filter(val -> Collections.frequency(list, val)>1).collect(Collectors.toList());
		System.out.println("duplicateList using Collection.frequescy: "+ duplicateList);
	}
}
