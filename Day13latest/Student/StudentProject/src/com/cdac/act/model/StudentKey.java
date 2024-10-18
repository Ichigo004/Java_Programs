package com.cdac.act.model;

import java.util.Objects;

public final class StudentKey {
	 private final int rollno;
	 private final String standard;
	 private final String division;
	 
	 public StudentKey(int rno , String stand  , String divi)
	 {
		 this.standard = stand;
		this.division= divi;
		this.rollno = rno;
	 }

	public int getRollno() {
		return rollno;
	}

	public String getStandard() {
		return standard;
	}

	public String getDivision() {
		return division;
	}

	@Override
	public String toString() {
		return "StudentKey [rollno=" + rollno + ", standard=" + standard + ", division=" + division + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(division, rollno, standard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentKey other = (StudentKey) obj;
		return Objects.equals(division, other.division) && rollno == other.rollno
				&& Objects.equals(standard, other.standard);
	}
	 	
	 
}
