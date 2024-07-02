package com.basics;

import java.util.Scanner;

public class SwitchLogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int input = sc.nextInt();
		SwitchLogic.isWeekDay(input);
		SwitchLogic.nameOfDay(input);
	}

	private static void isWeekDay(int input) {
		switch (input) {
		case 1:
			System.out.println("Day of the week");
			break;
		case 2:
			System.out.println("Day of the week");
			break;
		case 3:
			System.out.println("Day of the week");
			break;
		case 4:
			System.out.println("Day of the week");
			break;
		case 5:
			System.out.println("Day of the week");
			break;
		case 6:
			System.out.println("Not Day of the week");
			break;
		default:
			System.out.println("Not Day of the week");
		}
	}

	private static void nameOfDay(int input) {
		switch (input) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("ThuresDay");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Ivalid input");
		}
	}

}
