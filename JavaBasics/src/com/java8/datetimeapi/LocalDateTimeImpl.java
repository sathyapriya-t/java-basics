package com.java8.datetimeapi;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeImpl {

	public static void main(String[] args) {
		
		//Creation
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " +localDateTime);
		LocalDateTime dateTime = LocalDateTime.of(2021, 12, 03, 10, 21);
		System.out.println("dateTime : "+dateTime);
		
		//Getting values
		System.out.println();
		System.out.println("Getting values!! ");
		System.out.println("getDayOfMonth : "+dateTime.getDayOfMonth());
		System.out.println("getDayOfYear : "+dateTime.getDayOfYear());
		System.out.println("getMonthValue : "+dateTime.getMonthValue());
		System.out.println("getMinute : "+dateTime.getMinute());
		System.out.println("getDayOfWeek : "+dateTime.getDayOfWeek());
		System.out.println("get(ChronoField.DAY_OF_WEEK) : "+dateTime.get(ChronoField.DAY_OF_WEEK));
		System.out.println("get(ChronoField.DAY_OF_MONTH) : "+dateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println("getMonth : "+dateTime.getMonth());

		//Modify DateTime
		System.out.println();
		System.out.println("Modify DateTime!! ");
		System.out.println("dateTime add 10 DECADES: "+dateTime.plus(10, ChronoUnit.DECADES));
		System.out.println("dateTime add 10 plusDays: "+dateTime.plusDays(10));
		System.out.println("dateTime add 200 plusYears: "+dateTime.plusYears(200));
		System.out.println("dateTime minus HALF_DAYS: "+dateTime.minus(10, ChronoUnit.HALF_DAYS));
		System.out.println("dateTime minusMinutes: "+dateTime.minusMinutes(100));
		System.out.println("dateTime minusMonths: "+dateTime.minusMonths(20));
		
		//Supporting Methods
		System.out.println();
		System.out.println("Supporting Methods !! ");
		System.out.println("dateTime isAfter : "+dateTime.isAfter(localDateTime));
		System.out.println("dateTime isSupported : "+dateTime.isSupported(ChronoField.DAY_OF_MONTH));
		
		//Creation Using ZoneId and Clock
		System.out.println();
		System.out.println("Creation dateTime Using ZoneId and Clock !! ");
		LocalDateTime dateTimeWithId = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("dateTimeWithId : "+dateTimeWithId);
		LocalDateTime dateTimeWithClock = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.println("dateTimeWithClock : "+dateTimeWithClock);
	}

}
