package com.oops.inheritance;

public class Person {
	private String emailId;
	private String name;
	private String phoneNumber;

	public Person(String emailId, String name, String phoneNumber) {
		this.emailId = emailId;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
