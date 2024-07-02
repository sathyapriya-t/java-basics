package com.java8.defaultstaticmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.data.Student;
import com.data.StudentDataBase;

public class DefaultStaticMethodsImpl {
	static Comparator<Student> comparingName = Comparator.comparing(Student::getName);
	static Comparator<Student> comparingGPA = Comparator.comparingInt(Student::getGradeLevel);

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("sathya", "priya", "Arun", "Jeeva");
		nameList.sort(Comparator.naturalOrder());
		System.out.println(nameList);
		nameList.sort(Comparator.reverseOrder());
		System.out.println(nameList);
		List<Student> list = compartorChaining();
		System.out.println("Sorting with Comparator chaining");
		list.forEach(System.out::println);
		System.out.println("sorting with custom list");
		List<Student> listName = compartorCustomList();
		listName.forEach(System.out::println);
		System.out.println("sorting with nulls values First throws exception, so use nullsfirst to handle it");
		List<Student> listNameNullsFirst = compartorNullsFirst();
		listNameNullsFirst.forEach(System.out::println);
		System.out.println("sorting with nulls values last throws exception, so use nullsLast to handle it");
		List<Student> listNameNullsLast = compartorNullsLast();
		listNameNullsLast.forEach(System.out::println);

		// Interface
		Multipier interfaces = new MultiplierImpl();
		interfaces.multiply(5, 1, 20); // calling the normal method which implemented by MultipilerImplClass
		List<Integer> asList = Arrays.asList(1, 3, 2, 5, 4, 6, 9, 7);
		System.out.println(interfaces.findListSize(asList)); // default method which is overriden by MultipilerImplClass
		System.out.println(Multipier.multiplyList(asList)); // static method Accessed with ClassName

	}

	private static List<Student> compartorChaining() { // throws Exception with null values
		List<Student> list = StudentDataBase.getAllStudents();
		list.sort(comparingName.thenComparing(comparingGPA));
		return list;
	}

	private static List<Student> compartorCustomList() {
		List<Student> list = StudentDataBase.getAllStudents();
		list.sort(comparingName);
		return list;
	}

	private static List<Student> compartorNullsFirst() { // handles null values first
		List<Student> list = StudentDataBase.getAllStudents();
		list.sort(Comparator.nullsFirst(comparingName));
		return list;
	}

	private static List<Student> compartorNullsLast() { // handles null values Last
		List<Student> list = StudentDataBase.getAllStudents();
		list.sort(Comparator.nullsLast(comparingName));
		return list;
	}

}
