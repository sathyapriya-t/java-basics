package com.oops.inheritance;

public class Student extends Person {

	public Student(String emailId, String name, String phoneNumber) {
		super(emailId, name, phoneNumber);
	}

	private int year;
	private String college;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String toString() {
		return String.format("college - %s , year - %d ", college, year);

	}

}
