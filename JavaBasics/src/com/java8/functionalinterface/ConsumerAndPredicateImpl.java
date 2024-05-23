package com.java8.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import com.data.Student;
import com.data.StudentDataBase;

public class ConsumerAndPredicateImpl {

	public static void main(String[] args) {
		Predicate<Student> p1 = (s) -> s.getGpa() > 3.5;
		Predicate<Student> p2 = (s) -> s.getGradeLevel() > 3;
		BiConsumer<String, List<String>> b1 = (name, activities) -> System.out.println(name + ":" + activities);
		custom(p1, p2, b1);

	}

	private static void custom(Predicate<Student> p1, Predicate<Student> p2, BiConsumer<String, List<String>> b1) {
		List<Student> stdList = StudentDataBase.getAllStudents();
		stdList.forEach(std -> {
			if (p1.and(p2).test(std)) {
				b1.accept(std.getName(), std.getActivities());
			}
		});
	}
}
