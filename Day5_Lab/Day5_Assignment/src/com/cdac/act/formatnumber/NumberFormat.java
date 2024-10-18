package com.cdac.act.formatnumber;
import java.util.Scanner;
public class NumberFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number : ");
		String mobNo = sc.nextLine();
		System.out.println(Format.format(mobNo));
		
	}

}
