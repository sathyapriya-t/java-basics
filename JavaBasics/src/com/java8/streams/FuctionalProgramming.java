package com.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FuctionalProgramming {

	public static void main(String[] args) {
		List<String> strList = List.of("sathya", "priya", "Arun");
		List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
		sumOfOddNumbers(intList);
		basicLoop(strList);
		loopWithFp(strList);
		loopFpWithFiltering(strList);
		printSquareOfFirstTenNumbers();
		mapAllWordsToLowerCase(strList);
		printTheLengthOfEachWords(strList);
		printTheLengthOfEachWordsUsingMap(strList);
		listOfOddNumbers(intList);
		squareOfFirstTenNumbers();

	}

	private static void basicLoop(List<String> strList) {
		for (String str : strList) {
			System.out.println(str);
		}
	}

	private static void loopWithFp(List<String> strList) {
		strList.stream().forEach(element -> System.out.println(element));
	}

	private static void loopFpWithFiltering(List<String> strList) {
		strList.stream().filter(element -> element.endsWith("a")).forEach(element -> {
			System.out.println("using filtering ");
			System.out.println(element);
		});
	}

	private static void sumOfOddNumbers(List<Integer> strList) {
		int intValue = strList.stream().filter(element -> element % 2 == 1).reduce(0, (num1, num2) -> num1 + num2)
				.intValue();
		System.out.println(intValue);
	}

	private static void listOfOddNumbers(List<Integer> strList) {
		List<Integer> intValue = strList.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
		System.out.println(intValue);

	}

	private static void printTheLengthOfEachWords(List<String> strList) {
		strList.stream().forEach(element -> {
			System.out.println(element.length());
		});
	}

	private static void printTheLengthOfEachWordsUsingMap(List<String> strList) {
		strList.stream().map(ele -> ele.length()).forEach(element -> {
			System.out.println(element);
		});
	}

	private static void mapAllWordsToLowerCase(List<String> strList) {
		strList.stream().map(ele -> ele.toLowerCase()).forEach(element -> {
			System.out.println(element);
		});
	}

	private static void printSquareOfFirstTenNumbers() {
		IntStream.range(0, 11).map(i -> i * i).forEach(ele -> System.out.println(ele));
	}

	private static void squareOfFirstTenNumbers() {
		IntStream.range(0, 11).map(i -> i * i).boxed().collect(Collectors.toList());
	}

}
