package com.java8.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDateWithPeriods {

	public static void main(String[] args) {

		Period period = Period.ofMonths(10);
		System.out.println("period : " + period);
		System.out.println("period getDays: " + period.getDays());
		System.out.println("period getMonths: " + period.getMonths());

		// period between LocalDates
		System.out.println();
		System.out.println("Comparing date using Period Between Method that returns Period");
		LocalDate localDate = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2020, 12, 03);
		System.out.println("localDate : " + localDate);
		System.out.println("localDate : " + localDate2);
		Period between = Period.between(localDate, localDate2);
		System.out.println("period between LocalDates !! ");
		System.out.println("Days between Period of Local Date " + between.getDays());
		System.out.println("Months between Period of Local Date " + between.getMonths());
		System.out.println("Years between Period of Local Date " + between.getYears());

		System.out.println();
		System.out.println("Comparing date using localDate util Method that returns Period");
		Period until = localDate.until(localDate2);
		System.out.println("period between LocalDates !! ");
		System.out.println("Days between Period of Local Date " + until.getDays());
		System.out.println("Months between Period of Local Date " + until.getMonths());
		System.out.println("Years between Period of Local Date " + until.getYears());

	}

}
