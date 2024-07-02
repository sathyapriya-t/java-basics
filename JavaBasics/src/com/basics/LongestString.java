package com.basics;

public class LongestString {

	public static void main(String[] args) {
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		longestDayOfTheWeek(days);
		printDaysBasckwards(days);

	}

	private static void longestDayOfTheWeek(String[] days) {
		String dayLong = "";
		int longestString = Integer.MIN_VALUE;
		for (String day : days) {
			if (day.length() > longestString) {
				longestString = day.length();
				dayLong = day;
			}

		}
		System.out.println(dayLong);
	}

	private static void printDaysBasckwards(String[] days) {
		for (String day : days) {
			String str = "";
			for (int i = 0; i < day.length(); i++) {
				str = day.charAt(i) + str;
			}
			System.out.println(str);
			System.out.println();

		}
	}

}
