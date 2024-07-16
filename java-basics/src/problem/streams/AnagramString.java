package problem.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramString {

	public static void main(String[] args) {
		// Check if two strings are anagrams or not using Java 8 streams
		// Write a Java 8 program to check if two strings are anagrams or not using the
		// stream API and lambda expressions.
		String string1 = "Sathya";
		String string2 = "ayhtaS";
		anagarm(string1, string2);
		
		anagramUsingJava8(string1, string2);

	}

	private static void anagramUsingJava8(String string1, String string2) {
		String sortedString = Arrays.stream(string1.split("")).sorted().collect(Collectors.joining(""));
		String sortedString1 = Arrays.stream(string2.split("")).sorted().collect(Collectors.joining(""));
		if (sortedString.equals(sortedString1)) {
			System.out.println("It is Anagram !!");
		} else {
			System.out.println("It not is Anagram !!");
		}
	}

	private static void anagarm(String string1, String string2) {
		String[] array1 = string1.split("");
		String[] array2 = string2.split("");
		Arrays.sort(array1);
		Arrays.sort(array2);
		if (Arrays.equals(array1, array2)) {
			System.out.println("It is Anagram !!");
		} else {
			System.out.println("It not is Anagram !!");
		}
	}

}
