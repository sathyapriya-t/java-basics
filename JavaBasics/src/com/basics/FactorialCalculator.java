package com.basics;
/*Coding Exercise: Calculate Factorial Of a Number
In this problem, you are tasked with completing the implementation of a FactorialCalculator class in Java that calculates the factorial of a given number.
The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
The factorial function can be defined by the product:
n! = n * (n-1) * (n-2) * ... * 3 * 2 * 1

For example,
4! = 4 * 3 * 2 * 1 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
1! = 1
0! is defined to be 1*/

public class FactorialCalculator {

	public int calculateFactorial(int number) {
		if (number == 0) {
			return 1;
		} else if (number > 0) {
			int factorial = 1;
			for (int i = 1; i <= number; i++) {
				factorial = factorial * i;
			}
			return factorial;
		} else {
			return -1;
		}

	}
}
