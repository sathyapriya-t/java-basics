package com.basics;

import java.util.Scanner;

public class PrimeNumber {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public PrimeNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		if (number > 0) {
			for (int i = 2; i <= number - 1; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;

	}

	public int sumOfN() {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + number;

		}
		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find if its prime or not: ");
		PrimeNumber num = new PrimeNumber(sc.nextInt());
		System.out.println(num.isPrime());
		System.out.println(num.sumOfN());
		System.out.println(num.sumOfDivisors());

	}
}
