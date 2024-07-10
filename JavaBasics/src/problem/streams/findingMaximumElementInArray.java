package problem.streams;

import java.util.Arrays;

public class findingMaximumElementInArray {
	public static void main(String[] args) {
		// Write a Program to find the Maximum element in an array?
		//max
		int[] intArray = { 1, 2, 3, 4, 5, 6, 6 };
		int max = Arrays.stream(intArray).max().orElse(0);
		System.out.println("max:" + max);
	}

}
