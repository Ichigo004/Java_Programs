package com.cdac.act.Account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cdac.act.Sorting.AccNameComparator;
import com.cdac.act.Sorting.BalanceComparator;
import com.cdac.act.Sorting.DooComparator;
import com.cdac.act.common.Validation;

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int choice;

		List<Account> accountslist = new ArrayList<Account>();

		do {

			System.out.println("======Menu=======");
			System.out.println("1. Add a account");
			System.out.println("2. Print all account");
			System.out.println("3. Sort by account no by desc");
			System.out.println("4. Sort by accName");
			System.out.println("5. Sort by Date of opening");
			System.out.println("6. Sort by balance desc");
			System.out.println("0.Exit");

			System.out.println("Enter the choice");
			choice = read.nextInt();

			switch (choice) {
			case 1: {
				read.nextLine();
				System.out.println("Enter the Account holder name");
				String name = read.nextLine();
				System.out.println("Enter the Date  in the format yyyy/MM/dd");
				String date = read.nextLine();
				System.out.println("Enter the balance");
				Double balance = read.nextDouble();


				LocalDate localDate =  Validation.validateDate(date);
				Double bal = Validation.validateBalance(balance);

				Account account = new Account(name, localDate, bal);
				accountslist.add(account);
				System.out.println("Account added successfully");
				break;
			}

			case 2:
			{
				for(Account account : accountslist)
				{
					System.out.println(account);
				}
			}

			case 3 : 
			{
				Collections.sort(accountslist);
				break;
			}

			case 4: 
			{
				Collections.sort(accountslist , new AccNameComparator());
				break;
			}

			case 5 :
			{
				Collections.sort(accountslist , new DooComparator());
				break;
			}
			case 6 :
			{
				Collections.sort(accountslist , new BalanceComparator());
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
