package com.java8.data;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateImpl {

	public static void main(String[] args) {

		Predicate<String> p1 = (std) -> std.endsWith("a");
		Predicate<String> p2 = (std) -> std.startsWith("S");
		List<Student> stdList = StudentDataBase.getAllStudents();
		List<Student> stdListAfter = stdList.stream().filter(std -> p1.and(p2).test(std.getName()))
				.collect(Collectors.toList());
		System.out.println(stdListAfter);

		p1.and(p2).test("sathya");
	}
}
