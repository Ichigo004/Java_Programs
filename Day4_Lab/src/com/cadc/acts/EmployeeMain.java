package com.cadc.acts;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String [] args)
	{
		
		Scanner ref = new Scanner(System.in);
		EmployeeInfo [] earr = new EmployeeInfo [20];
		
		int count = 0;
		int choice;
		do
		{
			System.out.println("------MENU------");
			System.out.println("1 -> Add New Employee");
			System.out.println("2 -> Display Details of Employee");
			System.out.println("3 -> Sort by Salary");
			System.out.println("0 -> Exit");

			choice = ref.nextInt();
			ref.nextLine();
			switch(choice)
			{
				
				case 1:
				{
					
					System.out.print("Name of Employee : ");
					String name = ref.nextLine();
					
					System.out.print("Department of Employee : ");
					String dept = ref.nextLine();
					
					System.out.print("Salary of Employee : ");
					double salary = ref.nextDouble();
					
					EmployeeInfo emp = new EmployeeInfo(name, dept, salary);
					earr[count] = emp;
					
					System.out.println("New Employee Added Successfully");
					System.out.println("Employee Id : " + earr[count].GetEmpId());
					
					count++;
					break;
				}
				
				case 2:
				{
					
					System.out.print("Enter Employee Id : ");
					int Empid = ref.nextInt();
					
					boolean found = false;
					for(int i = 0; i < count; i++)
					{
						if(Empid==earr[i].GetEmpId() )
						{ 
							System.out.println("Employee Details Available");
							earr[i].Display();
							found = true;
							break;
						}
					}
						if(!found)
						{
							System.out.println("Employee Details are Not Available");
						}
					
					break;
						
				}
				
				case 3:
				{
					for(int i = 0; i < count; i++)
					{
						for(int j = 0; j < count - i - 1; j++)
						{
							if(earr[j].GetSalary() > earr[j + 1].GetSalary())
							{
								EmployeeInfo temp = earr[j];
								earr[j] = earr[j + 1];
								earr[j + 1] = temp;
							}
						}
					}
					
					for(int i = 0; i < count; i++)
					{
						earr[i].Display();
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
