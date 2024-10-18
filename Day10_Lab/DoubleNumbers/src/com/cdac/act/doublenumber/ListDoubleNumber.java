package com.cdac.act.doublenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDoubleNumber {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<Double> doubleslist = new ArrayList<Double>();
		
		int i = 0;
		while(i < 4)
		{
				System.out.println("Enter the Number");
				double num = read.nextDouble();
				doubleslist.add(num);
				read.nextLine();
				i++;
		
		}
		System.out.println(" All the Numbers is " + doubleslist);
		double sum = 0;
		for(Double d : doubleslist)
		{
			sum += d;
		}
		System.out.println("The sum of all the Numbers is " + sum);
		
		
		
	}
}
