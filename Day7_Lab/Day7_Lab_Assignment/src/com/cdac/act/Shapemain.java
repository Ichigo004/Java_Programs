package com.cdac.act;

import java.util.Scanner;

public class Shapemain {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int choice = 0;
		Shape sh = null;
		do {
			
			System.out.println("----Menu----");
			System.out.println("1. Area of circle");
			System.out.println("2. Perimeter of circle");
			System.out.println("3. Area of Rectangle");
			System.out.println("4. Perimeter of Rectangle");
			System.out.println("5. Draw a circle");
			System.out.println("6. Draw a rectangle");
			System.out.println("0. Exit");
			choice = read.nextInt();
			
			
			switch (choice) {
			case 1: {
				
				System.out.println("Enter the radius");
				int r = read.nextInt();
				sh = new Circle(r);
				System.out.println(sh.calculateArea());
				break;
			}
			
			case 2: {
				
				System.out.println("Enter the radius");
				int r = read.nextInt();
				sh = new Circle(r);
				System.out.println(sh.calculatePerimeter());
				break;
			}
			
			case 3: {
				
				System.out.println("Enter the length");
				int l = read.nextInt();
				System.out.println("Enter the breadth");
				int b = read.nextInt();
				sh = new Rectangle(l , b);
				System.out.println(sh.calculateArea());
				break;
			}
				
			case 4: {
				
				System.out.println("Enter the length");
				int l = read.nextInt();
				System.out.println("Enter the breadth");
				int b = read.nextInt();
				sh = new Rectangle(l , b);
				System.out.println(sh.calculatePerimeter());
				break;
			}
			
			case 5:
			{
				
				sh = new Circle();
				if(sh instanceof Circle)
				{
					Circle c = (Circle)sh;
					c.draw();
				}
				break;
			}
			
			case 6:
			{
				
				sh = new Rectangle();
				if(sh instanceof Rectangle)
				{
					Rectangle r = (Rectangle)sh;
					r.draw();
				}
				break;
			}
			
			case 0:
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		} while (choice != 0);
	}
}
