package com.cdac.act;

public class Address {
	
	private String Line1;
	private String Line2;
	private String landmark;
	private int Pincode;
	
	public Address(String line1, String line2, String landmark, int pincode) {
		this.Line1 = line1;
		this.Line2 = line2;
		this.landmark = landmark;
		this.Pincode = pincode;
	}

	
	public String getLine1() {
		return Line1;
	}

	public void setLine1(String line1) {
		Line1 = line1;
	}

	public String getLine2() {
		return Line2;
	}

	public void setLine2(String line2) {
		Line2 = line2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [Line1=" + Line1  
				+ ", Line2=" 
				+ Line2 
				+ ", landmark=" 
				+ landmark 
				+ ", Pincode=" 
				+ Pincode + "]";
	}
	
	
	
	
}
