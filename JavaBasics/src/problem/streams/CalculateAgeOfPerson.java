package problem.streams;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeOfPerson {

	public static void main(String[] args) {
		// Calculate the age of a person in years
		// Write a Java 8 program to calculate the age of a person in years given their birthday.
		
		int date = 10;
		int month = 12;
		int year = 2020;
		calculateAge(date, month, year);

	}

	private static void calculateAge(int date, int month, int year) {
		LocalDate localDate = LocalDate.of(year, month, date);
		LocalDate currentDate = LocalDate.now();
		int age = Period.between(localDate, currentDate).getYears();
		System.out.println("Age of person: "+ age);
	}

}
