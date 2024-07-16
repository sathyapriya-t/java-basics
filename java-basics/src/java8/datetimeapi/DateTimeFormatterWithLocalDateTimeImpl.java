package java8.datetimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterWithLocalDateTimeImpl {
	public static void main(String[] args) {

		// Parse - takes a string converts to LocalDateTime
		// Format - Takes LocalDateTime converts to String

		stringToLocalDateUsingParse();
		localDateToStringUsingFormat();
	}

	private static void localDateToStringUsingFormat() {

		// Format
		System.out.println();
		System.out.println("LocalDateTime to String!!");
		LocalDateTime localDateTime = LocalDateTime.now();
		String datetime = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("dateTime: " + datetime);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd|HH|mm|ss");

		
		String dateTime1 = localDateTime.format(dateTimeFormatter);
		System.out.println("dateTime with Custom DataTimeFormatter: " + dateTime1);

	}

	private static void stringToLocalDateUsingParse() {

		// Parse
		System.out.println("string to LocalDateTime !!");
		String dateTime = "2025-06-27T12:30:00";
		LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
		System.out.println("localDateTime: " + localDateTime);
		LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("localDateTime With DateTimeFormmator Constant: " + localDateTime1);

		// With Custom Pattern
		String dateTime1 = "2025*06*27*12*30*00";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd*HH*mm*ss");
		LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
		System.out.println("localDateTime With DateTimeFormmator custom pattern: " + localDateTime2);

	}

}
