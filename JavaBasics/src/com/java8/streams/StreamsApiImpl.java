package com.java8.streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		// terminal collect operations
		System.out.println(collectAverageDoubleEg());
		System.out.println(collectSummingIntEg());
		System.out.println(collectMinBy().get());
		System.out.println(collectMaxBy().get());
		System.out.println(collectMappingEg());
		System.out.println(collectCountingEg());
		System.out.println(collectJoiningEgOne());
		System.out.println(collectJoiningEgTwo());
		System.out.println(collectJoiningEg());
		System.out.println(aggregationSum());
		System.out.println(aggregationMax());
		System.out.println(aggregationMin());
		System.out.println(boxedEg());
		System.out.println(mapToLongEg());
		System.out.println(collcectGroupingByWithOneArgument());
		System.out.println(collcectGroupingByWithTwoArgument());
		System.out.println(collcectGroupingByWithThreeArgument());
		System.out.println(groupingByWithMaxByEg());
		System.out.println(groupingByWithMaxByWithCollectingAndThenEg());
		System.out.println(partitioningByWithOneArgument());
		System.out.println(partitioningByWithTwoArgument());
	
	}
	
	private static Map<Boolean, Set<Student>> partitioningByWithTwoArgument() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(std -> std.getGradeLevel() >= 3.5,Collectors.toSet()));
	}

	private static Map<Boolean, List<Student>> partitioningByWithOneArgument() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(std -> std.getGradeLevel() >= 3.5));
	}
	
	private static Map<Integer, Object> groupingByWithMaxByWithCollectingAndThenEg() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
	}
	private static Map<Integer, Optional<Student>> groupingByWithMaxByEg() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
	}
	private static Map<String, Long> collcectGroupingByWithThreeArgument() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender,LinkedHashMap::new,Collectors.counting()));
	}

	
	private static Map<String, Long> collcectGroupingByWithTwoArgument() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
	}

	private static Map<String, List<Student>> collcectGroupingByWithOneArgument() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
	}

	private static long mapToLongEg() {
		return IntStream.rangeClosed(1, 50).mapToLong(i -> i).sum();
	}

	private static List<Integer> boxedEg() {
		return IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
	}

	private static int aggregationMin() {
		return IntStream.range(1, 10).min().getAsInt();
	}

	private static int aggregationMax() {
		return IntStream.range(1, 12).max().getAsInt();
	}

	private static int aggregationSum() {
		return IntStream.range(1, 2).sum();
	}

	private static String collectJoiningEg() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	}

	private static String collectJoiningEgTwo() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining("-", "{", "}"));
	}

	private static String collectJoiningEgOne() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
	}

	private static Long collectCountingEg() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.counting());
	}

	private static List<Integer> collectMappingEg() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getGradeLevel, Collectors.toList()));
	}

	private static Optional<Student> collectMinBy() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGradeLevel)));
	}

	private static Optional<Student> collectMaxBy() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGradeLevel)));
	}

	private static Integer collectSummingIntEg() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getGradeLevel));
	}

	private static Double collectAverageDoubleEg() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingDouble(Student::getGpa));
	}

	private static Integer reduceEg() {
		return StudentDataBase.getAllStudents().stream().map(Student::getGradeLevel).filter(std -> std > 4).reduce(0,
				(a, b) -> a * b);
	}

	private static Stream<Student> customSorting() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName));
	}

	private static long countEg() {
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(std -> std.stream())
				.distinct().count();
	}

	private static List<Double> mapToDoubleEg() {
		return StudentDataBase.getAllStudents().stream().mapToDouble(Student::getGradeLevel).boxed()
				.collect(Collectors.toList());
	}

	private static List<String> flatMapEg() {
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(std -> std.stream())
				.distinct().collect(Collectors.toList());
	}

}
