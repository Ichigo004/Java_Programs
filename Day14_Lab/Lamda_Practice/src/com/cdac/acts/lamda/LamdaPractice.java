package com.cdac.acts.lamda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class LamdaPractice {
	
	public static void main(String[] args) {
		
		// Function
		// R	apply​(T t)
		// (t) -> LocalDate.parse(t)
		Function<String, LocalDate> parser = (str) -> LocalDate.parse(str);
		LocalDate date = parser.apply("2012-12-12");
		System.out.println("Function Lamda = " + date);
				
		//BiFunction
		//R	apply​(T t, U u)
		//(t, u) -> t * u
		BiFunction<Integer, Integer, Integer> multiplication = (t, u) -> t * u;
		Integer r = multiplication.apply(8, 5);
		System.out.println("BiFunction Lamda = " + r);
		
		//Predicate
		//boolean	test​(T t)
		//(t) -> t % 2
		Predicate<Integer> even = (t) -> t % 2 == 0;
		Boolean num = even.test(35);
		System.out.println("Predicate = " + num);
		Boolean num1 = even.test(r);
		System.out.println("Predicate = " + num1);
		
		//forEach
		List<Integer> list = new ArrayList<Integer>();
		list.add(26);
		list.add(12);
		list.add(76);
		list.add(19);
		list.add(85);
		list.add(3);
		System.out.println("forEach");
		list.forEach((s) -> System.out.println(s));
		
		//Comparator
		//int	compare​(T o1, T o2)
		//(o1,o2) -> o1.compareTo(o2)
		Comparator<Integer> list1 = (o1,o2) -> o1.compareTo(o2);
		Collections.sort(list, list1);
		System.out.println("Sort by list " + list);
		
		//Double Predicate
		//boolean	test​(double value)
		//(double value) -> value > 500.00
		DoublePredicate money = (value) -> (value) > 500.00;
		Boolean num2 = money.test(430.00);
		System.out.println("DoublePredicate = " + num2);
		Boolean num3 = money.test(580.00);
		System.out.println("DoublePredicate = " + num3);
		
		//Consumer
		//void	accept​(T t)
		//(t) -> sysout(str)
		Consumer<String> consumer = (str) -> System.out.println(str);
		consumer.accept("Hello Eclipse");
		
		
	}
}
