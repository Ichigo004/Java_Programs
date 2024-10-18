package com.cdac.act.classes;

public class Fruits {
	
	private String name;
	private String color;
	private int  price;
	private int  quantity;
	
	public Fruits(String name, String color, int price, int quantity) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
