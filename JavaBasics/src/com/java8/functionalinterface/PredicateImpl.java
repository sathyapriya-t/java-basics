package com.java8.functionalinterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

public class PredicateImpl {

	public static void main(String[] args) {

		Predicate<String> p1 = (std) -> std.endsWith("a");
		Predicate<String> p2 = (std) -> std.startsWith("S");
		List<Student> stdListAfter = printStudentStartsWithSAndEndsWithA(p1, p2);

		System.out.println(stdListAfter);
		System.out.println(p1.and(p2).test("Sathya"));
		System.out.println(p1.or(p2).test("Aruna"));
		System.out.println(p1.negate().test("sathya"));
	}

	private static List<Student> printStudentStartsWithSAndEndsWithA(Predicate<String> p1, Predicate<String> p2) {
		List<Student> stdList = StudentDataBase.getAllStudents();
		List<Student> stdListAfter = stdList.stream().filter(std -> p1.and(p2).test(std.getName()))
				.collect(Collectors.toList());
		return stdListAfter;
	}
}
