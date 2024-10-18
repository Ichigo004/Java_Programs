package com.cdac.act.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Applemain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Apple> appleslist = new ArrayList<Apple>();
		Apple apple = new Apple("Red" , 5.0 , "Sweet");
		appleslist.add(apple);
		Apple apple1 = new Apple("Green" , 6.0 , "Sour");
		appleslist.add(apple1);
		Apple apple2 = new Apple("Black" , 1.0 , "Plungent");
		appleslist.add(apple2);
		Apple apple3 = new Apple("Red" , 3.0 , "Palatableness");
		appleslist.add(apple3);

		Integer choice;
		do {

			System.out.println("****Fruit Basket****");
			System.out.println("1 Filter by weight");
			System.out.println("2 filter by color");
			System.out.println("3 filter by color and weight");
			System.out.println("4 filter by color, weight and taste");
			System.out.println("5 Sort by weight");
			System.out.println("6 Sort by color");
			System.out.println("7 Remove red apples");
			System.out.println("8 Removed Green apples");
			System.out.println("9 Convert to Set collection");
			System.out.println("0 Exit");			
			System.out.println("Enter your choice");
			choice = sc.nextInt();			
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter weight");
				Double weig = sc.nextDouble();
				List<Apple> stream = appleslist.stream()
						.filter((a) -> a.getWeight() >= weig)
						.collect(Collectors.toList());
				System.out.println(stream);

				break;
			}

			case 2: {
				System.out.println("Enter color");
				String col = sc.nextLine();
				List<Apple> stream = appleslist.stream()
						.filter((a) -> a.getColor().equals(col))
						.collect(Collectors.toList());
				stream.forEach(System.out::println);

				break;
			}

			case 3: {
				System.out.println("Enter color");
				String col = sc.nextLine();
				System.out.println("Enter weight");
				Double wei = sc.nextDouble();
				List<Apple> stream = appleslist.stream()
						.filter((a) -> a.getColor().equals(col))
						.filter((a) -> a.getWeight() >= wei)
						.collect(Collectors.toList());
				System.out.println(stream);

				break;
			}

			case 4: {
				System.out.println("Enter color");
				String col = sc.nextLine();
				System.out.println("Enter weight");
				Double wei = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Taste");
				String tt = sc.nextLine();
				List<Apple> stream = appleslist.stream()
						.filter((a) -> a.getColor().equalsIgnoreCase(col))
						.filter((a) -> a.getWeight()>=wei)
						.filter((a) -> a.getTaste().equalsIgnoreCase(tt))
						.collect(Collectors.toList());
				System.out.println(stream);

				break;
			}

			case 5: {
				List<Apple> stream = appleslist.stream()
						.sorted((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()))
						.collect(Collectors.toList());
				System.out.println(stream);
				
				break;
			}
			case 6: {
				List<Apple> stream = appleslist.stream()
						.sorted((a1, a2) -> a1.getColor().compareTo(a2.getColor()))
						.collect(Collectors.toList());
				System.out.println(stream);
				
				break;
			}
			case 7: {
				List<Apple> stream = appleslist.stream()
						.filter((a) -> !a.getColor().equals("Red"))
						.collect(Collectors.toList());
				System.out.println(stream);
				
				break;
			}
			case 8: {
				List<Apple> stream = appleslist.stream()
						.filter((a) -> !a.getColor().equals("Green"))
						.collect(Collectors.toList());
				System.out.println(stream);
				
				break;
			}
			case 9: {
				Set<Apple> stream = appleslist.stream()
						.collect(Collectors.toSet());
				System.out.println(stream);
				
				break;
			}
			
			case 0 :
			{
				break;
			}
			default:
			
			}
			



		} while (choice != 0);

	}
}
