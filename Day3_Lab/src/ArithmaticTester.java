package com.cdac.acts.tester;

import com.cdac.acts.arithmatic.Arithmatic;
import java.util.Scanner;

public class ArithmaticTester
{
		public static void main(String [] args)
		{
				Scanner sc = new Scanner(System.in);
				Arithmatic ar=new Arithmatic();
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int sum = ar.add(num1 , num2);
				System.out.println("Sum is " + sum);
		}
}