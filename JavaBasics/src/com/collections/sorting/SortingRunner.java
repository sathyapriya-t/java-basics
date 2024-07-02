package com.collections.sorting;

import java.util.ArrayList;
import java.util.List;

public class SortingRunner {

	public static void main(String[] args) {

		List<Student> list1 = List.of(new Student(10, "sathya"), new Student(5, "priya"));
		List<Student> arrayList = new ArrayList<Student>(list1);
		arrayList.sort(new AscSorting());
		System.out.println(arrayList);
		arrayList.sort(new DesSorting());
		System.out.println(arrayList);

	}

}
