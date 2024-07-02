package com.oops.inheritance;

public class runner {

	public static void main(String[] args) {

		// inheritance
		// Student
		Student person = new Student("sathya2001t@gamil.com", "sathya", "123456");
		person.setYear(2022);
		person.setCollege("anna university");
		System.out.println(person.toString());

		// Employee
		Employee employee = new Employee("sathya2001t@gamil.com", "sathya", "123456", "Assocate Software Engineer");
		employee.setEmployeeGrade('A');
		employee.setSalary("50000");
		employee.setEmployer("TCS");
		System.out.println(employee.toString());

	}

}
