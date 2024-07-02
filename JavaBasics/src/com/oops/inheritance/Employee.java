package com.oops.inheritance;

public class Employee extends Person {
	private String title;
	private String employer;
	private char employeeGrade;
	private String salary;

	public Employee(String emailId, String name, String phoneNumber, String title) {
		super(emailId, name, phoneNumber);
		this.title = title;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	@Override
	public String toString() {
		return String.format("Name- %s , title -%s ,employer - %s,employeeGrade -%c ,salary- %s",super.getName(),title,employer,employeeGrade,salary);
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

}
