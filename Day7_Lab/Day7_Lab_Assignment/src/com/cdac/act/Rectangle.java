package com.cdac.act;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	
	public Rectangle ()
	{
		super();
	
	}
	
	public Rectangle (int l , int b)
	{
		super();
		this.length = l;
		this.breadth = b;
	}



	public int getLength() {
		return length;
	}


	public int getBreadth() {
		return breadth;
	}

	
	public void draw()
	{
		System.out.println("No need to draw Rectangle");
	}
	
	@Override
	public double calculateArea() {
		return  (length * breadth);
	}


	@Override
	public double calculatePerimeter() {
		return (2 * (length + breadth)); 
	}
	
}
