//Problem - Sum of Squares of First N Numbers
/*You are given an integer n. Your task is to implement a method calculateSumOfSquares in the class SumOfSquares that calculates and returns the sum of squares of all positive integers up to n (inclusive).
      For example, if n = 3, the method should return the sum 1^2 + 2^2 + 3^2 = 14.
      If n is less than 0, the method should return -1.

      Instructions:
          1.The incomplete code provided contains a class named SumOfSquares with a method signature public long calculateSumOfSquares(int n).
          2.Complete this method to calculate the sum of squares of all positive integers up to n. If n is less than 0, return -1.
          3.Do not print anything in your code. The method should return the sum or -1.
*/
package com.basics;

public class SumOfSquares {
	public long calculateSumOfSquares(int n) {
		long sum = 0;
		if (n < 0) {
			return -1;
		}
		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		return sum;
	}
}