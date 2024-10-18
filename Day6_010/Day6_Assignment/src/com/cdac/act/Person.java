package com.cdac.act;

import java.util.Date;

public class Person {
	
	private String name	;
	private String aadharCard;
	private String dob;
	private Address address;

	
	public Person(String name, String aadharCard, String  dob, Address address) {
		this.name = name;
		this.aadharCard = aadharCard;
		this.dob = dob;
		this.address = address;
	}


	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAadharCard() {
		return aadharCard;
	}




	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}




	public String  getDob() {
		return dob;
	}




	public void setDob(String dob) {
		this.dob = dob;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", aadharCard=" + aadharCard + ", dob=" + dob + ", address=" + address + "]";
	}
	
	
	
	
}
