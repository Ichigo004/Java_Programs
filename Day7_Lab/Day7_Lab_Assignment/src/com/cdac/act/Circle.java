package com.cdac.act;

public class Circle extends Shape {

	private int radius;
	private final double PI = 3.142;
	
	
	
	public Circle() {
		super();
	}
	

	public Circle(int radius) {
		super();
		this.radius = radius;
	}


	
	public int getRadius() {
		return radius;
	}


	public double getPI() {
		return PI;
	}

	
	public void draw()
	{
		System.out.println("No need to draw Circle");
	}

	@Override
	public double calculateArea() {
		return  (PI * radius * radius);
	}


	@Override
	public double calculatePerimeter() {
		return (2 * PI * radius); 
	}

	
}
