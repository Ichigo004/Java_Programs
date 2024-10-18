package com.cdac.act.classes;

public class Main {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Raja");
		Student s2 = new Student(11, "Aaja");
		Student s3 = new Student(12, "Paja");
		
		Student ref1 = null;
		System.out.println("1st GC");
		Runtime.getRuntime().gc();
		System.out.println(Runtime.version());
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException i)
		{
			i.printStackTrace();
		}
		
		Student ref2 = null;
		System.out.println("2nd GC");
		Runtime.getRuntime().gc();
		System.out.println(Runtime.version());
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException i)
		{
			i.printStackTrace();
		}
		
		
		Student ref3 = null;
		System.out.println("3rd GC");
		Runtime.getRuntime().gc();
		System.out.println(Runtime.version());
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException i)
		{
			i.printStackTrace();
		}
	
		
		
		
	}
}
