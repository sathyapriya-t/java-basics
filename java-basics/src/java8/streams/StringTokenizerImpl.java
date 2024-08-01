package java8.streams;

import java.util.Collections;
import java.util.StringTokenizer;

public class StringTokenizerImpl {

	public static void main(String[] args) {

		// normal
		String string = "sathya priya arun kumar";
		System.out.println(string);
		stringTokenizer(string);

		// using java8
		System.out.println();
		stringTokenizerUsingStreams(string);

		// using custom value
		System.out.println();
		String string1 = "sathya|priya|;arun|kumar";
		stringTokenizerUsingStreamsWithCustomValue(string1);

		// considering custom value itself as a token
		System.out.println();
		String string2 = "sathya|priya|;arun|kumar";
		stringTokenizerUsingStreamsWithCustomValueAndConsideringItAsToken(string2);

	}

	private static void stringTokenizerUsingStreamsWithCustomValue(String string) {
		Collections.list(new StringTokenizer(string, "|;")).stream().map(token -> (String) token)
				.forEach(System.out::println);
		System.out.println("Completed using java 8 with custom value !");

	}

	private static void stringTokenizerUsingStreamsWithCustomValueAndConsideringItAsToken(String string) {
		Collections.list(new StringTokenizer(string, ";", true)).stream().map(token -> (String) token)
				.forEach(System.out::println);
		System.out.println("Completed using java 8 with custom value !");

	}

	private static void stringTokenizerUsingStreams(String string) {
		Collections.list(new StringTokenizer(string)).stream().map(token -> (String) token)
				.forEach(System.out::println);
		System.out.println("Completed using java 8 !");

	}

	private static void stringTokenizer(String string) {
		StringTokenizer str = new StringTokenizer(string);
		int countTokens = str.countTokens();
		System.out.println("Token count: " + countTokens);
		while (str.hasMoreTokens()) {
			String nextToken = str.nextToken();
			System.out.println(nextToken);
		}
		System.out.println("Completed using regular java!");
	}

}
