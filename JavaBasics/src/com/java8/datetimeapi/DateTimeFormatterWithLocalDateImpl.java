package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterWithLocalDateImpl {
	public static void main(String[] args) {

		// Parse - takes a string converts to LocalDate
		// Format - Takes LocalDate converts to String

		stringToLocalDateUsingParse();
		localDateToStringUsingFormat();
	}

	private static void localDateToStringUsingFormat() {
		// LocalDate to String
		System.out.println();
		System.out.println("LocalDate to String !!");
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		String formattedDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		String formattedDate1 = date.format(dateTimeFormatter);
		System.out.println("Formatted Date using Constant: " + formattedDate);
		System.out.println("Formatted Date using Custom Format: " + formattedDate1);

	}

	private static void stringToLocalDateUsingParse() {
		// String to LocalDate
		System.out.println("String to LocalDate !!");
		String date = "2024-06-26";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate: " + localDate);

		// String to LocalDate using DateTimeFormatter Constant!!
		System.out.println();
		System.out.println("String to LocalDate using DateTimeFormatter Constant!!");
		LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDate using DateTimeFormatter Constant: " + date1);

		// String to LocalDate using DateTimeFormatter Constant!!
		System.out.println();
		System.out.println("String to LocalDate using DateTimeFormatter Constant !!");
		String date2 = "20240626";
		LocalDate localDate1 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("LocalDate using DateTimeFormatter Constant: " + localDate1);

		// Custom Pattern
		System.out.println();
		System.out.println("String to LocalDate using DateTimeFormatter Custom pattern !!");
		String date3 = "2024|06|26";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate2 = LocalDate.parse(date3, dateTimeFormatter);
		System.out.println("LocalDate using DateTimeFormatter Custom Pattern: " + localDate2);
	}

}
