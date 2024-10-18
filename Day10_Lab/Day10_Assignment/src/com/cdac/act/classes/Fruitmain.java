package com.cdac.act.classes;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Fruitmain {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	ArrayList<Fruits> fruitslist = new ArrayList<Fruits>();

	int choice;

	do {

		System.out.println("----Menu for fruits----");
		System.out.println("1.Adding fruit in the list");
		System.out.println("2.Remove fruit by index");
		System.out.println("3.Print whole list using advacned for");
		System.out.println("4.Print whole list using for each");
		System.out.println("5.Print whole list using forword iterator");
		System.out.println("6.Print whole list using backword iterator");
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
			System.out.println("Enter index to remove");
			int in = sc.nextInt();
			if(in > 0 && in < fruitslist.size() )
			{
				fruitslist.remove(in);
				System.out.println("Fruists list removed successfully");
			}
			break;
		}
		case 3: 
		{
			System.out.println("Display the list using advance for");
			for(Fruits f : fruitslist )
			{
				System.out.println(f);
			}
			break;
		}
		case 4: 
		{
			System.out.println("Display the list using foreach loop");
			fruitslist.forEach(System.out::println);
			break;
			
		}
		case 5: 
		{
			System.out.println("Display the list using forward iterator");
			ListIterator<Fruits> fruits  = fruitslist.listIterator();
			while(fruits.hasNext())
			{
				Fruits fruits2 = fruits.next();
				System.out.println(fruits2);
			}
			break;
		}
		case 6: 
		{
			System.out.println("Display the list using reverse iterator");
			System.out.println(fruitslist.size());

			ListIterator<Fruits> iteratorlist = fruitslist.listIterator(fruitslist.size());
			while (iteratorlist.hasPrevious())
			{
				Fruits fruits = iteratorlist.previous();
				System.out.println(fruits);
			}
			break;
		}


		case 0 :
			break;
		default:

		}

	}while(choice != 0);

	}
}

