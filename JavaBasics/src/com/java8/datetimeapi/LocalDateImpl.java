package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateImpl {

	public static void main(String[] args) {
		
		//Creation
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();;
		System.out.println(time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		//Getting
		LocalDate date1 = LocalDate.of(2019, 10, 03);
		System.out.println("date1 " + date1);
		LocalDate date2 = LocalDate.ofYearDay(2020, 365);
		System.out.println("date3 ofYearDay" + date2);
		LocalDate date3 = LocalDate.ofEpochDay(19880);
		System.out.println("date3 ofEpochDay " +date3);
		System.out.println("date3 getDayOfMonth " +date3.getDayOfMonth());
		System.out.println("date3 getDayOfYear " +date3.getDayOfYear());
		System.out.println("date3 getYear " +date3.getYear());
		System.out.println("date3 getEra " +date3.getEra());
		System.out.println("date3 getMonthValue " +date3.getMonthValue());
		//Get USING Temporal field
		System.out.println("date3 get using chronoFiled" +dateTime.get(ChronoField.MINUTE_OF_DAY));
		
		
		//Modify the date
		System.out.println();
		System.out.println("Modify the date!!");
		System.out.println("date3 " +date3);
		System.out.println("date3 plusDays " +date3.plusDays(5));
		System.out.println("date3 plusMonths " +date3.plusMonths(2));
		System.out.println("date3 plusWeeks " +date3.plusWeeks(10));
		System.out.println("date3 minusDays " +date3.minusDays(1));
		System.out.println("date3 minusMonths " +date3.minusMonths(2));
		System.out.println("date3 minusYears " +date3.minusYears(2));
		System.out.println("date3 minusWeeks " +date3.minusWeeks(10));
		System.out.println("date3 withYear " +date3.withYear(2020));
		System.out.println("date3 .with(ChronoField.DAY_OF_MONTH, 2) " +date3.with(ChronoField.DAY_OF_MONTH, 2));
		System.out.println("date3 .with(TemporalAdjusters.firstDayOfYear() " +date3.with(TemporalAdjusters.firstDayOfYear()));
		System.out.println("date3 .with(TemporalAdjusters.lastDayOfMonth() " +date3.with(TemporalAdjusters.lastDayOfMonth()));
		
		
		//Addition supporting Methods
		System.out.println();
		System.out.println("Addition supporting Methods!!");
		System.out.println("date3 " +date3);
		System.out.println("date3 lengthOfMonth " +date3.lengthOfMonth());
		System.out.println("date3 lengthOfYear " +date3.lengthOfYear());
		System.out.println("date3 isLeapYear " +date3.isLeapYear());
		System.out.println("date3 isAfter " +date3.isAfter(date1));
		System.out.println("date3 isl̥Equal " +date3.isEqual(date1));
		System.out.println("date3 isBefore " +date3.isBefore(date1));
		
		//To find if the methods supprorst
		//System.out.println(date.with(ChronoField.HOUR_OF_DAY,0)); //Throws exception
		System.out.println("Supprot check with TemporalField " +date.isSupported(ChronoField.HOUR_OF_DAY));//(False) because we are using time with date
		System.out.println("Supprot check with TemporalUnit " +date.isSupported(ChronoUnit.HOURS));//(False) because we are using time with date

		
		
		

	}

}
