package com.cdac.classes;

import java.text.ParseException;




import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.cdac.enums.Degree;
import com.cdac.validations.NumberValidation;
import com.cdac.validations.*;
import com.cdac.exceptions.*;
import com.cdac.sorting.DOBCompare;
import com.cdac.sorting.GraduationDateCompare;
public class Main {

	public static void main(String[] args) throws ParseException {
		List<JobSeeker> jobSeekerslist  = new LinkedList<JobSeeker>();
		Scanner sc = new Scanner(System.in);
		Integer choice;

		do {

			System.out.println("*****JOB SEEKER PORTAL*****");
			System.out.println("1 Add all details");
			System.out.println("2 Update email");
			System.out.println("3 Display all job seeker by their degree type");
			System.out.println("4 Sort JobSeeker details as per email");
			System.out.println("5 Sort JobSeeker details as per dob ");
			System.out.println("6 Sort customer details  as per graduationDate  ");
			System.out.println("0 exit");

			System.out.print("enter the choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {

				System.out.println("Enter the RegistrationID");
				Integer regId = sc.nextInt();

				sc.nextLine();
				System.out.println("Enter the First Name");
				String fname = sc.nextLine().toUpperCase();

				//				sc.nextLine();
				System.out.println("Enter the Last Name");
				String lname = sc.nextLine().toUpperCase();

				//				sc.nextLine();
				System.out.println("Enter the Email-Address");
				String email = sc.nextLine().toLowerCase();
				String checkemail = NumberValidation.getemailvalidate(email);

				//				sc.nextLine();
				System.out.println("Enter the Password");
				String pass = sc.nextLine();

				System.out.println("Enter your Degree {BE ,BA , BBA , BOptom , BSC}");
				String degtype = sc.nextLine().toUpperCase();
				Degree degree  = Degree.valueOf(degtype);


				System.out.println("Enter Date of Birth these format yyyy/MM/dd ");
				String dob = sc.nextLine();
				LocalDate dobdate = DOBValidation.getdobdate(dob);

				//				sc.nextLine();
				System.out.println("Enter your Aadhar Number");
				String aadhar = sc.nextLine();
				String aadharcheck = NumberValidation.getaadharNumber(aadhar);

				//				sc.nextLine();
				System.out.println("Enter your Phone Number");
				String mob = sc.nextLine();
				String numcheck = NumberValidation.getphoneNumber(mob);

				//				sc.nextLine();
				System.out.println("Enter your date of graduation in these format yyyy/MM/dd");
				String grad = sc.nextLine();
				LocalDate graddate = GraduationValidation.getgraduatedate(grad);

				if(jobSeekerslist != null)
				{
					JobSeeker jobSeeker = new JobSeeker(regId, fname, lname, checkemail, pass, dobdate ,aadharcheck, numcheck, graddate, degree);
					jobSeekerslist.add(jobSeeker);
					System.out.println("Job Seeker Add successfully");
					System.out.println(jobSeekerslist);
					System.out.println("***********************************************");
				}
				break;
			}

			case 2:
			{
				System.out.println("Enter the Registration Id");
				Integer reg = sc.nextInt();

				for(JobSeeker js : jobSeekerslist)
				{
					if(js.getRegisterId() == reg)
					{
						sc.nextLine();
						System.out.println("Update the Email Address");
						String email = sc.nextLine();

						js.setEmail(email);
						System.out.println("Email address updated successfully");
					}
				}
				break;
			}

			default:



			case 3:
			{
				for(JobSeeker js : jobSeekerslist)
				{
					System.out.println(js);
				}
			}

			case 4:
			{
				Collections.sort(jobSeekerslist);
				break;
			}

			case 5:
			{
				Collections.sort(jobSeekerslist , new DOBCompare());
				break;
			}

			case 6:
			{
				Collections.sort(jobSeekerslist , new GraduationDateCompare());
				break;
			}

			}
		} while (choice != 0);
	}
}



