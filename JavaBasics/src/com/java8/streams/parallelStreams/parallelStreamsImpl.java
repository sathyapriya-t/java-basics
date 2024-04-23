package com.java8.streams.parallelStreams;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

public class parallelStreamsImpl {

	public static void main(String[] args) {

		sequentialStreamEg();
		parallelStreamEg();

	}

	private static long sequentialStreamEg() {

		long start = System.currentTimeMillis();
		long value = StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(std -> std.stream())
				.distinct().count();
		long end = System.currentTimeMillis();
		System.out.println("Sequential Duration :" + (end - start));
		return value;

	}

	private static long parallelStreamEg() {

		long start = System.currentTimeMillis();
		long value = StudentDataBase.getAllStudents().stream().parallel().map(Student::getActivities)
				.flatMap(std -> std.stream()).distinct().count();
		long end = System.currentTimeMillis();
		System.out.println("parallel Duration :" + (end - start));

		return value;

	}

}
