package com.cadc.acts.student;
import java.util.Scanner;

public class Studentmain {
	
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		StudentInfo si[] = new StudentInfo [10];
		
		int count = 0;
		int choice;
		
		do
		{
			System.out.println("------MENU------");
			System.out.println("1 -> Add New Student");
			System.out.println("2 -> Display Details of Student");
			System.out.println("3 -> Sort by Marks");
			System.out.println("0 -> Exit");

			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				
				case 1:
				{
					
					System.out.print("Name of Student : ");
					String name = sc.nextLine();
					
					System.out.print("Marks of Student : ");
					int marks = sc.nextInt();
					
					StudentInfo std = new StudentInfo(name, marks);
					si[count] = std;
					
					System.out.println("New Student Added Successfully");
					System.out.println("Roll No. : " + si[count].Getroll());
					
					count++;
					break;
				}
				
				case 2:
				{
					
					System.out.print("Enter Student Roll No. : ");
					int Empid = sc.nextInt();
					
					boolean found = false;
					for(int i = 0; i < count; i++)
					{
						if(Empid==si[i].Getroll() )
						{ 
							System.out.println("Student Details Available");
							si[i].Display();
							found = true;
							break;
						}
					}
						if(!found)
						{
							System.out.println("Student Details are Not Available");
						}
					
					break;
						
				}
				
				case 3:
				{
					for(int i = 0; i < count; i++)
					{
						for(int j = 0; j < count - i - 1; j++)
						{
							if(si[j].Getmarks() > si[j + 1].Getmarks())
							{
								StudentInfo temp = si[j];
								si[j] = si[j + 1];
								si[j + 1] = temp;
							}
						}
					}
					
					for(int i = 0; i < count; i++)
					{
						si[i].Display();
					}
					break;
				}
				
				case 0:
				{
					break;
				}
			}
		}while(choice != 0);
	}
}

