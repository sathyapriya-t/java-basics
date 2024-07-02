package com.oops.menu;

public class Menu {
	private static int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		Menu.value = value;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		Menu.value2 = value2;
	}

	private static int value2;

	public static int generate(int option) {

		switch (option) {
		case 1:
			return value + value2;
		case 2:
			return value - value2;
		case 3:
			return value * value2;
		case 4:
			return value / value2;
		default:
			return -1;
		}
	}

}
