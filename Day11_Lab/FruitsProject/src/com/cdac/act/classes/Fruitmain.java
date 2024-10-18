//Sort fruits by color ( natural order)
//3. Sort by quantity
//4. Sort by price


package com.cdac.act.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

import com.cdac.act.sorting.CompareQuantity;
import com.cdac.act.sorting.PriceCompare;

public class Fruitmain {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	ArrayList<Fruits> fruitslist = new ArrayList<Fruits>();

	int choice;

	do {

		System.out.println("----Menu for fruits----");
		System.out.println("1.Adding fruit in the list");
		System.out.println("2.Display the fruit list");
		System.out.println("3.Sort fruits by color ( natural order)");
		System.out.println("4. Sort by quantity");
		System.out.println("5. Sort by price");
		System.out.println("0. Exit");
		choice = sc.nextInt();


		switch (choice) {
		case 1: {

			String str = "Y";
			while(str.equals("Y"))
			{	sc.nextLine();
				System.out.println("Please Enter name of the fruits");
				String name = sc.nextLine();
				System.out.println("Please Enter color of the fruits");
				String color = sc.nextLine();
				System.out.println("Please Enter price of the fruits");
				int price = sc.nextInt();
				System.out.println("Please Enter quantity of the fruits");
				int quantity= sc.nextInt();
				
				Fruits fruits = new Fruits(name, color, price, quantity);
				fruitslist.add(fruits);

				sc.nextLine();
				System.out.println("Do you want to add more fruits");
				str = sc.nextLine();
			}
			break;
		}	

		case 2: 
		{
			for(Fruits fruits: fruitslist)
			{
				System.out.println(fruits);
			}
		}break;
		case 3: 
		{
			Collections.sort(fruitslist);
			break;
		}
		case 4: 
		{
			Collections.sort(fruitslist , new CompareQuantity());
			break;
			
		}
		case 5: 
		{
			Collections.sort(fruitslist , new PriceCompare());
			break;
		}
		case 6: 
		{
			break;
		}


		case 0 :
			break;
		default:

		}

	}while(choice != 0);

	}
}

