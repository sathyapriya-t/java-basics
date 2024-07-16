package java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class UtilDateAndSQLToLocalDateAndViceVersaImpl {

	public static void main(String[] args) {

		// Converting java.util.Date to LocaLDate
		Date date = new Date();
		System.out.println("Date: " + date);
		System.out.println("Date to LocalDate ");
		LocalDate localDate = date.toInstant().atZone(ZoneId.of("Asia/Tokyo")).toLocalDate();
		System.out.println("Date to LocalDate: " + localDate);

		// Converting LocaLDate to java.util.Date
		Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.of("Asia/Tokyo")).toInstant());
		System.out.println("LocalDate TO date " + date1);

		// Converting LocaLDate to java.sql.Date
		System.out.println();
		System.out.println("Converting LocaLDate to java.sql.Date !! ");
		java.sql.Date date2 = java.sql.Date.valueOf(localDate);
		System.out.println("LocalDate to java.sql.Date: " + date2);

		// Converting java.sql.Date to LocaLDate
		System.out.println();
		System.out.println("Converting java.sql.Date to LocaLDate !! ");
		java.sql.Date date3 = new java.sql.Date(20241203);
		System.out.println("java.sql.Date to LocaLDate: " + date3.toLocalDate());
		System.out.println("java.sql.Date to LocaLDate: " + date2.toLocalDate());
	}

}
