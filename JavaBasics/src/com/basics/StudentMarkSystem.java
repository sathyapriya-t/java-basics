package com.basics;

/*Student Grades A to F based on Marks
You are tasked with implementing the functionality of a Student class which calculates and assigns the student's grade based on the provided marks.

A student's grade is determined by the following criteria:

If the student's marks are less than 0 or greater than 100, the grade should be 'X'.
If the student's marks are greater than or equal to 90, the grade should be 'A'.
If the student's marks are greater than or equal to 80 but less than 90, the grade should be 'B'.
If the student's marks are greater than or  equal to 70 but less than 80, the grade should be 'C'.
If the student's marks are greater than or equal to 60 but less than 70, the grade should be 'D'.
If the student's marks are greater than or equal to 50 but less than 60, the grade should be 'E'.
If the student's marks are less than 50, the grade should be 'F'.
*/
public class StudentMarkSystem {
	private int marks;

	public StudentMarkSystem(int marks) {
		this.marks = marks;
	}

	public char assignGrade() {

		if (marks >= 90 && marks <= 100) {
			return 'A';
		} else if (marks >= 80 && marks < 90) {
			return 'B';
		} else if (marks >= 70 && marks < 80) {
			return 'C';
		} else if (marks >= 60 && marks < 70) {
			return 'D';
		} else if (marks >= 50 && marks < 60) {
			return 'E';
		} else if (marks < 50 && marks >= 0) {
			return 'F';
		} else {
			return 'X';

		}
	}
}
