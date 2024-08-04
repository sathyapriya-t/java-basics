package problem.basics;

import java.util.Arrays;

public class RotateTheArrayOfInteger {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 6 };
		// Just swapping the near lelements
		usingTempAndSwap(intArray);

		// Swpping with temp and odd even values of Array
		usingTempAndSwapingFirstLastValue(intArray);

		// shifting from the specific position and New Array
		// First we will loop through the elements from the position to end of the array
		// and add it to the new temp array
		// Next we will decrement from the position and it to the new Array
		int len = intArray.length;
		int position = 2;
		usingNewArrayAndStoringValues(intArray, len, position);

	}

	private static void usingNewArrayAndStoringValues(int[] intArray, int len, int position) {
		int[] tempArray = new int[len];
		int cout = 0;
		for (int i = position - 1; i < len; i++) {
			tempArray[cout] = intArray[i];
			cout++;
		}

		for (int i = 0; i < position - 1; i++) {
			tempArray[cout] = intArray[i];
			cout++;
		}

		System.out.println(Arrays.toString(tempArray));
	}

	private static void usingTempAndSwapingFirstLastValue(int[] intArray) {
		int len = intArray.length;
		if (len % 2 == 0) {
			int temp = 0;
			for (int i = 0; i < (len / 2) - 1; i++) {
				temp = intArray[i];
				intArray[i] = intArray[len - i];
				intArray[len - i] = temp;
			}

		} else {
			int temp = 0;
			for (int i = 0; i < ((len / 2) - 2); i++) {
				temp = intArray[i];
				intArray[i] = intArray[len - i];
				intArray[len - i] = temp;
			}

		}
		System.out.println(Arrays.toString(intArray));
	}

	private static void usingTempAndSwap(int[] intArray) {
		int temp = 0;
		for (int i = 0; i < intArray.length - 1; i++) {
			temp = intArray[i];
			intArray[i] = intArray[i + 1];
			intArray[i + 1] = temp;
		}
		System.out.println(Arrays.toString(intArray));
	}

}
