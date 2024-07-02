package com.oops.menu;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int value = input.nextInt();
		menu.setValue(value);

		System.out.println("Enter the number: ");
		int value2 = input.nextInt();
		menu.setValue2(value2);

		System.out.println("1- Add");
		System.out.println("2- subtract");
		System.out.println("3- Multiply");
		System.out.println("4- Divide");
		System.out.println("Choose operation");

		int option = input.nextInt();
		System.out.printf("the result is: %d", Menu.generate(option));

	}

}
