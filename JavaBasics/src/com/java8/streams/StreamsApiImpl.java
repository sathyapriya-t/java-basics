package com.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

public class StreamsApiImpl {

	public static void main(String[] args) {
		System.out.println(flatMapEg());
		System.out.println(mapToDoubleEg());
		System.out.println(countEg());
		System.out.println(customSorting());
		System.out.println(reduceEg());
		
	}

	private static Integer reduceEg() {
		return StudentDataBase.getAllStudents().stream().map(Student :: getGradeLevel).filter(std -> std > 4).reduce(0, (a,b) -> a*b);
	}

	private static Stream<Student> customSorting() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName));
	}

	private static long countEg() {
		return StudentDataBase.getAllStudents().stream().map(Student :: getActivities)
		.flatMap(std -> std.stream()).distinct().count();
	}

	private static List<Double> mapToDoubleEg() {
		return StudentDataBase.getAllStudents().stream().mapToDouble(Student::getGradeLevel).boxed().collect(Collectors.toList());
	}

	private static List<String> flatMapEg() {
		return StudentDataBase.getAllStudents().stream().map(Student :: getActivities)
		.flatMap(std -> std.stream()).distinct()
		.collect(Collectors.toList());
	}

}
