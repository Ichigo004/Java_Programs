package com.cdac.acts.classes;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.acts.common.AccountsType;
import com.cdac.acts.common.FormatedDate;

public class Main {
	
	public static void main(String[] args) throws ParseException {
			
		Scanner sc = new Scanner(System .in);
		Account account[] =  new Account[5];
		int count = 0;
		int choice;
		AccountsType type;
		do {
				System.out.println("----Menu Driven----");
				System.out.println("1. Create Account");
				System.out.println("2. Display the account details");
				System.out.println("3. Deposit the Amount");
				System.out.println("4. Withdraw the Amount");
				System.out.println("5. Calculate the Maturity Amount");
				System.out.println("0. Exit");
				
				System.out.println("Enter the choice");
				choice = sc.nextInt();

			switch (choice) {
			case 1: {
				
				sc.nextLine();
				System.out.println("Enter the account holder name");
				String name = sc.nextLine();
				
				System.out.println("Enter Date of opening for account ");
				String str = sc.nextLine();
				Date date = FormatedDate.getDateString(str);
				
				System.out.println("Enter type of account saving, current , fixed depoist");
				String types = sc.nextLine();
				type  = AccountsType.valueOf(types.toLowerCase());
				
				System.out.println("Enter the amount");
				double amt = sc.nextDouble();
				
				if(type.equals("saving"))
				{
					account[count] = new SavingAccount(name, date, amt);
				}

				if(type.equals("current"))
				{
					account[count] = new CurrentAccount(name, date, amt);
				}
				
				if(type.equals("fixed_deposit"))
				{
					account[count] = new SavingAccount(name, date, amt);
				}
				
				count++;
				System.out.println("Your Account number is " + account[count].getAccNumber());
				System.out.println("Your " + type + " account created successfully..");
				
				
			}
			default:
				
			}
		} while (choice != 0);
		
	}
}
