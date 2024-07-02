package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeConversionImpl {

	public static void main(String[] args) {
		
		//Local Date
		LocalDate localDate = dateToDateTime();
		LocalTime localTime = timeToLocalDateTime(localDate);
		dateTimeToDateAndTime(localDate, localTime);
		
	}

	private static void dateTimeToDateAndTime(LocalDate localDate, LocalTime localTime) {
		LocalDateTime localDateTime = localTime.atDate(localDate);
		System.out.println("Conversion LocalDateTime to LocalDate : "+localDateTime.toLocalDate());
		System.out.println("Conversion LocalDateTime to LocalTime : "+localDateTime.toLocalTime());
	}

	private static LocalTime timeToLocalDateTime(LocalDate localDate) {
		LocalTime localTime = LocalTime.of(12, 34);
		System.out.println("Conversion localTime to LocalDateTime : "+localTime.atDate(localDate));
		return localTime;
	}

	private static LocalDate dateToDateTime() {
		LocalDate localDate = LocalDate.of(2001, 12, 03);
		System.out.println("Conversion localDate to LocalDateTime : "+ localDate.atTime(10, 21, 30, 145));
		return localDate;
	}

}
