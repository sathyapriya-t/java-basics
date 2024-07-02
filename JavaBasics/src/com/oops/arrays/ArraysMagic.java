package com.oops.arrays;

public class ArraysMagic {

	public static void main(String[] args) {
		Student student = new Student("sathya", 1, 2, 3, 4, 99, 100);
		System.out.println(student.sumOfMarks());
		System.out.println(student.getMaximumMarks());
		System.out.println(student.getAverageMarks());

	}

}
