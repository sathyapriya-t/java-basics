package com.basics;

/*In this programming challenge, you are given an incomplete Java method named findSecondLargestElement(int[] array) in the class ArrayMagic.
This method takes an array of integers and returns the second largest element in that array.
If there are fewer than two distinct elements in the array, the method should return -1.
For instance, if all elements are the same or the array contains only one element, there is no second largest element, so the method should return -1.

Instructions:
Begin by understanding the existing structure of the findSecondLargestElement(int[] array) method. You can see that it takes an integer array as an argument and its return type is an integer.
You need to implement the logic to find the second largest number in the array. If there is no second largest number (for example, if all the elements are the same or if the array has less than two elements), return -1.
If there are two or more distinct elements, you need to find the second largest one. For this, iterate over the array, comparing each element with the currently largest and second largest elements. Remember to initialize these two tracking variables properly.
Finally, return the second largest element or -1 if there is no second largest element.
Consider edge cases.
For example, what happens if all the elements in the array are the same?
What if the array contains fewer than two elements?
*/
public class SecondLargestNumber {

	public int findSecondLargestElement(int[] array) {
		if (array.length <= 1) {
			return -1;
		}
		int largest = -1;
		int secondLargest = -1;

		for (int i : array) {
			if (i > largest) {
				secondLargest = largest;
				largest = i;
			} else if (i != largest && i > secondLargest) {
				secondLargest = i;

			}
		}
		return secondLargest;

	}
}
