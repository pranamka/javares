package com.test.mvcdemo;

public class Student {
	
	private String firstName; 
	private String lastName;
	private String emailid;
	
	public Student(String firstName, String lastName, String emailid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailid = emailid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	} 
	
	
	

}
