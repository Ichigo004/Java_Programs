package com.cdac.act.classes;

public class Apple {

	private String color;
	private Double weight;
	private String taste;
	
	public Apple() {
		super();
	}

	public Apple(String color, double weight, String taste) {
		super();
		this.color = color;
		this.weight = weight;
		this.taste = taste;
	}

	public String getColor() {
		return color;
	}

	public Double getWeight() {
		return weight;
	}

	public String getTaste() {
		return taste;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", taste=" + taste + "]";
	}
	
	
	
	
	
}
