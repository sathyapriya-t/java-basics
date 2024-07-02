package com.problem.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysIntoOne {

	public static void main(String[] args) {
		
		// Merge two unsorted arrays into a single sorted array using Java 8 streams
		// Write a Java 8 program to merge two unsorted arrays into a single sorted
		// array using the stream API.
		int[] randomNumbers = { 12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43 };
		int[] randomNumber2 = { 4, 32, 2, 5, 6, 78, 98, 53, 90 };
		withDuplicates(randomNumbers, randomNumber2);
		
		//Merge two unsorted arrays into a single sorted array without duplicates
		//Write a Java 8 program to merge two unsorted arrays into a single sorted array without duplicates
		withoutDuplicates(randomNumbers, randomNumber2);
	}

	private static void withoutDuplicates(int[] randomNumbers, int[] randomNumber2) {
		// Instream.concat(Intstream,Intstream) - takes two intstream and return as
		// -> single intstream
		int[] joinedArray = IntStream.concat(Arrays.stream(randomNumbers), Arrays.stream(randomNumber2)).distinct()
				.toArray();
		System.out.println("joinedArray: " + joinedArray);
	}

	private static void withDuplicates(int[] randomNumbers, int[] randomNumber2) {
		// Instream.concat(Intstream,Intstream) - takes two intstream and return as
		// -> single intstream
		int[] joinedArray = IntStream.concat(Arrays.stream(randomNumbers), Arrays.stream(randomNumber2)).toArray();
		System.out.println("joinedArray: " + joinedArray);
	}

}
