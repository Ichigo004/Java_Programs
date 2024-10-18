package com.cdac.classes;

import java.time.LocalDate;

import com.cdac.enums.Degree;

public class JobSeeker implements Comparable<JobSeeker> {
	
	private Integer registerId;
	private String  firstName;
	private String  lastName;
	private String email;
	private String  passsword;
	private LocalDate dateOfBirth;
	private String aadharId;
	private String phoneNumber;
	private LocalDate graduationDate;
	private Degree degree;
	
	public JobSeeker() {
		super();
	}

	public JobSeeker(Integer registerId, String firstName, String lastName, String email, String passsword,
			LocalDate dateOfBirth, String aadharId, String phoneNumber, LocalDate graduationDate,Degree degree ) {
		super();
		this.registerId = registerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passsword = passsword;
		this.dateOfBirth = dateOfBirth;
		this.aadharId = aadharId;
		this.phoneNumber = phoneNumber;
		this.graduationDate = graduationDate;
		this.degree = degree;
	}

	public Integer getRegisterId() {
		return registerId;
	}

	public String getFitstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	

	public String getPasssword() {
		return passsword;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAadharId() {
		return aadharId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public LocalDate getGraduationDate() {
		return graduationDate;
	}
	
	public Degree getdegree()
	{
		return degree;
	}

	@Override
	public String toString() {
		return "JobSeeker [registerId=" + registerId + " Name=" + firstName + " " + lastName
				+ ", email= " + email +  " ,Degree " + degree +" , passsword=" + passsword + ", dateOfBirth=" + dateOfBirth + ", aadharId="
				+ aadharId + ", phoneNumber=" + phoneNumber + ", graduationDate=" + graduationDate +  "]";
	}

	@Override
	public int compareTo(JobSeeker o) {
		// TODO Auto-generated method stub
		return this.getEmail().compareTo(o.getEmail());
	}
	
	
	
	
	
	
	
}
