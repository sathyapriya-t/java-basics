package java8.datetimeapi;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeWithDuration {

	public static void main(String[] args) {

		// Creation
		Duration d = Duration.ofHours(120);
		System.out.println("Duration of Hours to Minutes : " + d.toMinutes());
		System.out.println("Duration of Hours to Days : " + d.toDays());

		// Comparing Time
		System.out.println();
		System.out.println("Comparing Time!! ");
		LocalTime localTime = LocalTime.now();
		LocalTime localTime1 = LocalTime.now().plusHours(10);
		Duration between = Duration.between(localTime, localTime1);
		System.out.println("Duration Between LOcalTimes : " + between.toHours());
		System.out.println("Duration Between LOcalTimes : " + between.toDays());

		// Using LocalTime Methods
		System.out.println();
		System.out.println("Local date Until Method!! ");
		System.out.println("Duration using Until Methods : " + localTime.until(localTime1, ChronoUnit.MINUTES));

	}

}
