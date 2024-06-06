package com.java8.datetimeapi;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeImpl {
	
	public static void main(String[] args) {
		
		//Creation
		LocalTime time = LocalTime.now();
		System.out.println("time " + time);
		LocalTime time1 = LocalTime.of(12, 3);
		System.out.println("time1 " +time1);
		LocalTime time2 = LocalTime.of(12, 3,8);
		System.out.println("time2 " +time2);
		LocalTime time3 = LocalTime.of(12, 3,8,986960);
		System.out.println("time3 " +time3);
		
		//Getting the values
		System.out.println();
		System.out.println("Getting the values!!");
		System.out.println("time getHour" +time3.getHour());
		System.out.println("time getHour" +time3.getMinute());
		System.out.println("time getSecond" +time3.getSecond());
		System.out.println("time getNano" +time3.getNano());
		System.out.println("time getHour with chrono/Temporal field " +time3.get(ChronoField.HOUR_OF_DAY));
		//System.out.println("time getHour with chrono/Temporal field " +time3.get(ChronoField.DAY_OF_WEEK)); //Throws Exception
		System.out.println("time getHour with chrono/Temporal field " +time3.getLong(ChronoField.CLOCK_HOUR_OF_DAY));
		
		//Modifing the values
		System.out.println();
		System.out.println("Modify the date!!");
		System.out.println("time .minus(0,ChronoUnit.HOURS) =" +time3.minus(0,ChronoUnit.HOURS));
		System.out.println("time plusHours =" +time3.plusHours(2));
		System.out.println("time .plusMinutes =" +time3.plusMinutes(12));
		System.out.println("time .plusNanos =" +time3.plusNanos(76485984));
		System.out.println("time3.range(ChronoField.HOUR_OF_DAY) =" +time3.range(ChronoField.HOUR_OF_DAY));

		//Aditional Supporting methods
		System.out.println();
		System.out.println("Aditional Supporting methods");
		System.out.println(time3.isAfter(time2));
		System.out.println(time3.isBefore(time2));
		System.out.println(time3.isSupported(ChronoUnit.HOURS));
		

	}

}
