package com.cdac.act.classes;

public class Main {

	public static void main(String[] args) throws Exception  {
		
		System.out.println(Thread.currentThread().getName());
		
		SumofNumbersCallable callable = new SumofNumbersCallable();
		
		String value = callable.call();
		System.out.println(value);
		
		System.out.println("Main Complete");
	}
}
