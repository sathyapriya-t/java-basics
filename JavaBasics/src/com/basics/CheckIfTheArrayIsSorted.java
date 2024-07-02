package com.basics;

/*Check if an Array is Sorted
You are given an incomplete Java method called isSorted() in the class ArrayMagic.
The method takes an integer array as an input and should return true if the array is sorted in ascending order, or false if it is not.
The method should handle the following edge cases:
If the array is empty or only contains one element, the method should return true, as such arrays are considered to be sorted.
The array may contain negative numbers and zero.
The array may contain duplicate elements.*/

public class CheckIfTheArrayIsSorted {
	public boolean isSorted(int[] array) {

		if (array.length == 1 || array.length == 0) {
			return true;
		}
		int count = 0;
		int first = array[0];
		for (int i = 0; i < array.length; i++) {
			if (first < array[i] || first == array[i]) {
				count++;
				first = array[i];
			}
		}
		System.out.println(count);
		if (count == array.length) {
			return true;
		} else {
			return false;
		}
	}
}
