package com.cdac.act.classes;

public class Fruits  implements Comparable<Fruits>{
	
	private String name;
	private String color;
	private Integer  price;
	private Integer  quantity;
	
	public Fruits(String name, String color, Integer price, Integer quantity) {
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

	public Integer getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(Fruits o) {
		return this.getColor().compareTo(o.getColor());
	}
	
	
	
	
}
