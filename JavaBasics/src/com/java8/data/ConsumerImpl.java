package com.java8.data;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerImpl {

	public static void main(String[] args) {
		Consumer<String> c1 = (a) -> System.out.println(a);
		BiConsumer<String, String> c2 = (a, b) -> System.out.println("Student : " + a + " Activities " + b);
		List<Student> stdList = StudentDataBase.getAllStudents();
		stdList.forEach(std -> c2.accept(std.getName(), std.getGender()));
		getAllName(c1);

	}

	private static void getAllName(Consumer<String> c1) {
		List<Student> stdList = StudentDataBase.getAllStudents();
		stdList.forEach(std -> c1.accept(std.getName()));
	}

}
