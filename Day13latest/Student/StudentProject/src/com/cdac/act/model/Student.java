package com.cdac.act.model;

public class Student {
	private String firstName;
	private String lastName;
	private StudentKey key;

	public Student() {
		super();
	}


	public Student(String firstName, String lastName, StudentKey key) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		//this.key = new StudentKey(rno ,  stand  , divi );
		this.key = key;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public StudentKey getKey() {
		return key;
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", key=" + key + "]";
	}

}
