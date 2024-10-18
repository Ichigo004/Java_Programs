package com.cadc.acts.student;

public class StudentInfo {

		private String name;
		private int roll;
		private int marks;
		private static int rollGen = 1;;
		
		public StudentInfo ()
		{
			this.name = " ";
			this.roll = rollGen++;
			this.marks = 0;
		}
		
		public StudentInfo (String name, int marks)
		{
			this.name = name;
			this.roll = rollGen++;
			this.marks = marks;
		}
		
		public int Getroll()
		{
			return roll;
		}
		
		public int Getmarks()
		{
			return marks;
		}
		
		public void Display()
		{
			System.out.println("[ Student Name : " + name + ", Roll No. : " + roll + ", Marks : " + marks + " ]");
		}
		
		
		
		
}
