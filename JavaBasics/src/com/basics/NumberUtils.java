package com.basics;

/*
Find Last Digit Of A Number In this problem,you are tasked with completing the implementation of a NumberUtils
class in
 * Java that retrieves the last digit of a given integer.
 *
 * The last digit of an integer n is the rightmost digit of the integer. For
 * instance, the last digit of 2345 is 5, and the last digit of 90 is 0.
 *
 * If the input number is 0,return 0 as the last digit of 0 is 0. If the input
 * number is negative,return-1 as the last digit of negative numbers will not be
 * considered in this problem.
 */
public class NumberUtils {

	private int number1;
	private int number2;

	public NumberUtils(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		return number % 10;
	}

	public int getSumOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		int sum = 0;
		while (number > 0) {
			int digits = number % 10;
			sum += digits;
			number = number / 10;

		}
		return sum;
	}

	public int getNumberOfDigits(int number) {
		if (number < 0) {
			return -1;
		} else if (number == 0) {
			return 1;
		}
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;

	}

	public int reverseNumber(int number) {
		if (number < 0) {
			return -1;
		}
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum = digit + sum * 10;
			number = number / 10;
		}
		return sum;

	}

	public int calculateLCM() {
		if (number1 < 0 || number2 < 0) {
			return -1;
		}
		int lcm = Math.max(number1, number2);
		int max = lcm;
		while (number2 > 0 && number1 > 0) {
			if (lcm % number2 == 0 && lcm % number1 == 0) {
				return lcm;
			}
			lcm += max;

		}
		return 0;
	}

	public int calculateGCD() {
		if (number1 < 0 || number2 < 0) {
			return 1;
		}
		if (number1 == number2) {
			return number2;
		}
		int gcd = Math.min(number1, number2);
		while (number2 > 0 && number1 > 0) {
			if (number2 % gcd == 0 && number1 % gcd == 0) {
				return gcd;
			}
			gcd--;
		}
		return 0;

	}
}
