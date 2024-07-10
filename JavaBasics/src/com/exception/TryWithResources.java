package com.exception;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {

		/*
		 * try with resource - will help you to auto close the methods Because Scanner
		 * Extends the Autoclosable interface we can use this without catch and finally
		 * block Try with resources basically does what finally block does with
		 * scanner.close()
		 */

		try (Scanner sc = new Scanner(System.in)) {
			int[] intArr = { 1, 2, 3, 4 };
			int number = intArr[sc.nextInt()];
			System.out.println("number: " + number);
		}
		
		// catch and Finally block is optional
		
		catch (ArrayIndexOutOfBoundsException exception) {
			System.err.println("ArrayIndexOutOfBoundsException");
		}
	}

}
