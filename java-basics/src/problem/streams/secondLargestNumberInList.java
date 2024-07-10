package problem.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondLargestNumberInList {

	public static void main(String[] args) {
		// Find the second largest number in an integer array
		// Write a Java 8 program to find the second largest number in an integer array.
		List<Integer> list = List.of(1, 45, 6, 7, 9, 8, 45, 5, 23);
		sendLargestUsingSortAndSkip(list);
		int[] intList = { 1, 4, 5, 6, 8, 9, 0 };
		secondLargestNumberInArray(intList);
	}

	private static void secondLargestNumberInArray(int[] intList) {
		Integer secondLargest = Arrays.stream(intList).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println("secondLargest from Array:" + secondLargest);
	}

	private static void sendLargestUsingSortAndSkip(List<Integer> list) {
		Integer secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElse(0);
		System.out.println("Second Largest: " + secondLargest);
	}

}
