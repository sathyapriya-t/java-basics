package com.java8.optionals;

import java.util.Optional;

import com.data.Bike;
import com.data.Student;
import com.data.StudentDataBase;

public class OptionalsImpl {

	public static void main(String[] args) {

		System.out.println(ofNullableEg("hello"));
		System.out.println(ofNullableEg(null));
		System.out.println(ofEg("hello"));
		System.out.println(empty());
		// System.out.println(ofEg(null)); //throws Exception
		System.out.println(orElse()); // takes string as input
		System.out.println(orElseWitHNull());
		System.out.println(orElseGet()); // takes supplier as input
		System.out.println(orElseGetWitHNull());
		System.out.println(orElseThrow()); // takes supplier as input and throws exception
		// System.out.println(orElseThrowWitHNull()); //Throws Exception
		ifPresent(); // access the object and let you do whatever you want
		System.out.println(filterAndMap());
		System.out.println(flatMapEg().get());

	}

	private static String filterAndMap() {
		Student std = StudentDataBase.studentSuplier.get();
		return Optional.ofNullable(std).filter(s -> s.getGpa() >= 3.5).map(Student::getName)
				.orElseGet(() -> "Null value invalid");
	}

	private static Optional<String> flatMapEg() {
		Student std = StudentDataBase.studentSuplier.get();
		return Optional.ofNullable(std).filter(s -> s.getGpa() >= 3.5).flatMap(value -> value.getBikeOptional())
				.map(Bike::getName);
	}

	private static Optional<String> ofNullableEg(String s) {
		Optional<String> options = Optional.ofNullable(s);
		return options;
	}

	private static Optional<String> ofEg(String s) {
		Optional<String> options = Optional.of(s);
		return options;
	}

	private static Optional<String> empty() {
		Optional<String> options = Optional.empty();
		return options;
	}

	private static String orElse() {
		Student std = StudentDataBase.studentSuplier.get();
		return Optional.ofNullable(std).map(Student::getName).orElse("Null value invalid");
	}

	private static String orElseWitHNull() {
		Student std = null;
		return Optional.ofNullable(std).map(Student::getName).orElse("Null value invalid");
	}

	private static String orElseGet() {
		Student std = StudentDataBase.studentSuplier.get();
		return Optional.ofNullable(std).map(Student::getName).orElseGet(() -> "Null value invalid");
	}

	private static String orElseGetWitHNull() {
		Student std = null;
		return Optional.ofNullable(std).map(Student::getName).orElseGet(() -> "Null value invalid");
	}

	private static String orElseThrow() {
		Student std = StudentDataBase.studentSuplier.get();
		return Optional.ofNullable(std).map(Student::getName)
				.orElseThrow(() -> new RuntimeException("Null value invalid!!"));
	}

//	private static String orElseThrowWitHNull() {
//		Student std = null;
//		return Optional.ofNullable(std).map(Student::getName).orElseThrow(() -> new RuntimeException( "Null value invalid!!"));
//	}
	private static void ifPresent() {
		Student std = StudentDataBase.studentSuplier.get();
		Optional.ofNullable(std).ifPresent(s -> System.out.println(s.getGender()));
	}
}
