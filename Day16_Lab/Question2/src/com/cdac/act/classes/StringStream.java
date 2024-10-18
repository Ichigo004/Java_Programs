package com.cdac.act.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringStream {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		List<String> stringlist = new ArrayList<>();

		stringlist.add("Naruto");
		stringlist.add("One Piece");
		stringlist.add("Attack on Titan");
		stringlist.add("Naruto"); // Duplicate
		stringlist.add("My Hero Academia");
		stringlist.add("Death Note");
		stringlist.add("One Piece"); // Duplicate
		stringlist.add("Sword Art Online");
		stringlist.add("Attack on Titan"); // Duplicate
		stringlist.add("Demon Slayer");
		
		
		Integer choice;

		do {

			System.out.println("***Anime List*** ");
			System.out.println("1 print distinct");
			System.out.println("2 print all with uppercase ");
			System.out.println("3 print which starts with specific letter ");
			System.out.println("4 concat all strings in the list");
			System.out.println("5 filter by ending with some text");
			System.out.println("0 Exit");
			System.out.println("Enter your choice");

			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				
				stringlist.stream()
				.distinct()
				.forEach(System.out::println);
				break;
			}
			case 2: {
				
				stringlist.stream()
				.map(s->s.toUpperCase())
				.forEach(System.out::println);
				break;
			}
			case 3: {
				
				stringlist.stream()
				.filter(s-> s .startsWith("D"))
				.forEach(System.out::println);
				break;
			}
			case 4: {
				
				String stream = stringlist.stream()
				.reduce(" ", (a,b) -> a+b +", ");
//				.map(s-> s.concat("," + s));
//				.collect(Collectors.toList());
				System.out.println(stream);
				break;
			}
			case 5: {
				
				stringlist.stream()
				.filter(s -> s.endsWith("e"))
				.forEach(System.out::println);
				break;
			}
			case 0:
			{
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		} while (choice != 0);
	}
}
