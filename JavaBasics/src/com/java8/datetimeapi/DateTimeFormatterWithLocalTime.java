package com.java8.datetimeapi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterWithLocalTime {
	public static void main(String[] args) {

		// Parse - takes a string converts to LocalTime
		// Format - Takes LocalTime converts to String

		stringToLocalTimeUsingParse();
		localTimeToStringUsingFormat();
	}

	private static void localTimeToStringUsingFormat() {
		// String to LocalTime
		System.out.println();
		System.out.println("String to LocalTime !!");
		String time = "20:00";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("localTime: " + localTime);

		// String to LocalTime using DateTimeFormatter Constant!!
		System.out.println();
		System.out.println("String to LocalTime using DateTimeFormatter Constant!!");
		LocalTime time1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("localTime using DateTimeFormatter Constant: " + time1);

		// String to LocalTime using DateTimeFormatter Constant!!
		System.out.println();
		System.out.println("String to LocalTime using DateTimeFormatter Constant !!");
		String time2 = "20:12:26";
		LocalTime localTime1 = LocalTime.parse(time2, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("LocalTime using DateTimeFormatter Constant: " + localTime1);

		// Custom Pattern
		System.out.println();
		System.out.println("String to LocalTime using DateTimeFormatter Custom pattern !!");
		String time3 = "20|06|26";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
		LocalTime localTime2 = LocalTime.parse(time3, dateTimeFormatter);
		System.out.println("LocalTime using DateTimeFormatter Custom Pattern: " + localTime2);
	}

	private static void stringToLocalTimeUsingParse() {
		// LocalTime to String
		System.out.println();
		System.out.println("LocalTime to String !!");
		LocalTime time = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
		String formattedTime = time.format(DateTimeFormatter.ISO_LOCAL_TIME);
		String formattedTime1 = time.format(dateTimeFormatter);
		System.out.println("Formatted Time using Constant: " + formattedTime);
		System.out.println("Formatted Time using Custom Format: " + formattedTime1);

	}

}
