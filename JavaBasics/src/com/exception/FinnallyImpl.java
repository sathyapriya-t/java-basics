package com.exception;

import java.util.Scanner;

public class FinnallyImpl {

	public static void main(String[] args) {
		String str = null;
		System.out.println("null");
		method1(str);
		System.out.println("Main Ended");
	}

	private static void method1(String str) {
		method2(str);
	}

	private static void method2(String str) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] intArr = { 1, 2, 3, 4 };
			int number = intArr[sc.nextInt()];
			System.out.println("number: " + number);
		} catch (Exception e) {
			// prints the stack trace
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			System.out.println("Finnaly block exceuted");
			// Always close this when using orelse it will cause memory usage issue
			sc.close();
		}

	}

}
