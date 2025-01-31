package com.cdac.act.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.cdac.act.model.StudentKey;

public class SchoolMain {

	public static void main(String[] args) {

		Map<StudentKey, Student> studMap = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		Integer choice;

		do {

			System.out.println("****School List****");
			System.out.println("1 Add Student");
			System.out.println("2 Find student using comibination of standard, division and roll no");
			System.out.println("3 Print all students");
			System.out.println("0 Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				sc.nextLine();
				System.out.println("Enter the first name");
				String fname = sc.nextLine();

				System.out.println("Enter the last name");
				String lname = sc.nextLine();

				System.out.println("Enter the Roll number");
				Integer rno = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Standard");
				String stand = sc.nextLine();

				System.out.println("Enter the division");
				String div = sc.nextLine();

				StudentKey studentKey = new StudentKey(rno , stand , div);

				if(studMap.containsKey(studentKey))
				{
					System.out.println("Already exit");
				}
				else
				{
					Student student = new Student(fname, lname, studentKey);
					studMap.put(studentKey, student);
				}
				break;

			}

			case 2:
			{
				System.out.println("Enter Roll Number");
				Integer searchRno = sc.nextInt();

				//				sc.nextLine();
				System.out.print("Enter Standard: ");
				String searchStandard = sc.nextLine();

				//				sc.nextLine();
				System.out.print("Enter Division: ");
				String searchDivision = sc.nextLine();

				StudentKey key = new StudentKey(searchRno, searchStandard, searchDivision);
				for(Map.Entry<StudentKey,Student> entry : studMap.entrySet())
				{
					StudentKey key2 = entry.getKey();
					if(key2.equals(key))
					{
						System.out.println(entry.getValue());
					}
				}

				break;

			}

			case 3:
			{
				System.out.println("***List of students***");
				for(Map.Entry<StudentKey, Student> entry : studMap.entrySet())
				{
					System.out.println(entry.getValue());
				}
				break;
			}

			case 0:
			{
				break;
			}

			default:
			}


		} while (choice != 0);
	}
}
