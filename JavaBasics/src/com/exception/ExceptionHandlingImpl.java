package com.exception;

public class ExceptionHandlingImpl {

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
		try {
			str.charAt(0);
		} catch (Exception e) {
			//prints the stack trace
			e.printStackTrace();
		}
	}

}
