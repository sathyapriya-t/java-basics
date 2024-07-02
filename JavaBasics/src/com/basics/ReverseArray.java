package com.basics;

import java.util.ArrayList;
import java.util.List;

/*Reverse an Array
In this task, your goal is to complete a method called reverseArray(int[] array) in the ArrayMagic Java class.
This method should take an array of integers and return an array that holds the elements of the input array, but in the reverse order.

Instructions

Your task is to implement the reverseArray method. To achieve this, you need to:
Define two pointers. Let's call them start and end. The start pointer should point to the first element of the array, while the end pointer should point to the last one.
Create a new array to store the reversed elements. You can call this array reversedArray.
Iterate over the input array starting from both ends (start and end) and moving towards the middle. During each iteration, you should:
Copy the element at the end index of the input array to the start index of reversedArray.
Copy the element at the start index of the input array to the end index of reversedArray.
Move the start pointer one step towards the end of the array.
Move the end pointer one step towards the beginning of the array.
Once all elements of the input array have been processed, reversedArray should hold the elements of the input array in reverse order. At this point, the method should return reversedArray.

Edge Cases
The reverseArray method should be able to handle a few edge cases:
If the input array is empty (i.e., its length is 0), the method should return an empty array.
If the input array contains only one element, the method should return the array back.*/
public class ReverseArray {

	public int[] reverseArray(int[] array) {
		System.out.println(array.length / 2);
		int j = array.length;
		if (array.length % 2 == 0) {
			for (int i = 0; i < array.length / 2; i++) {
				int temp = array[i];
				array[i] = array[j - 1];
				array[j - 1] = temp;
				j = j - 1;

			}
		} else {
			for (int i = 0; i < array.length / 2; i++) {
				int temp = array[i];
				array[i] = array[j - 1];
				array[j - 1] = temp;
				j = j - 1;

			}
		}
		return array;

	}

	/**
	 * This method generates a list of multiples of a given number less than a
	 * specified limit.
	 *
	 * @param number the number to find multiples of
	 * @param limit  the upper bound for the multiples
	 * @return a List of multiples of the number less than the limit
	 */
	public List<Integer> determineMultiples(int number, int limit) {

		List<Integer> list = new ArrayList<>();
		if (number >= 1) {
			for (int i = 1; number * i < limit; i++) {
				list.add(number * i);
			}
		}
		return list;

	}
}
