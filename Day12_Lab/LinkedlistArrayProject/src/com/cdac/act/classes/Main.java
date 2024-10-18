package com.cdac.act.classes;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import com.cdac.act.exceptions.MinBalanceException;
import com.cdac.act.sorting.DateofOpeningCompare;
import com.cdac.act.validation.ValidateUtils;

public class Main {

	public static void main(String[] args) throws ParseException,AccountNotFoundException, MinBalanceException {

		List<Account> accountlist = new LinkedList<Account>();
		Scanner sc = new Scanner(System.in);
		Integer choice;

		do {

			System.out.println("*****Access to Account*****");
			System.out.println("1 Accept A/C details from user");
			System.out.println("2 Display all Accounts content using Enhanced For loop");
			System.out.println("3 Accept account No & display details");
			System.out.println("4 Deposit");
			System.out.println("5 Transfer one A/C to another A/C");
			System.out.println("6 Accept A/C NO & remove A/C from List");
			System.out.println("7 Apply interest on all saving A/C");
			System.out.println("8 Sort accounts as per ascending A/C No.");
			System.out.println("9 Sort by accountOpeningDate");
			System.out.println("0 Exit");

			System.out.print("Enter the choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {

				sc.nextLine();
				System.out.print("Enter the account holder name: ");
				String name = sc.nextLine();

				System.out.print("Enter Date of opening for account in format yyyy/MM/dd :  ");
				String str = sc.nextLine();
				LocalDate date = ValidateUtils.getdate(str);

				System.out.print("Enter the amount: ");
				Double amt = sc.nextDouble();	

				if(null != accountlist)
				{
					Account account = new Account(name, date, amt);
					accountlist.add(account);
					System.out.println("Account added successfully");
				}break;
			}
			case 2:
			{
				for(Account account : accountlist )
				{
					System.out.println(account);
				}
				break;
			}

			case 3:
			{
				System.out.println("Enter the Account Number");
				Integer acc = sc.nextInt();
				boolean found = false;
				for(Account ac : accountlist)
				{
					try {
						if (ac.getAccNum().equals(acc)) {
							System.out.println(ac);
							found = true;
							break;
						} else {
							throw new AccountNotFoundException("Account not found");
						}
					} catch (AccountNotFoundException e) {
						e.printStackTrace();
						System.out.println(e.getLocalizedMessage());
					}
				}

				if (!found) {
					System.out.println("Account with number " + acc + " not found.");
				}
			}
			break;


			case 4:
			{
				System.out.println("Enter the Account Number");
				Integer acc = sc.nextInt();

				sc.nextLine();
				for(Account ac : accountlist)
				{
					if(ac.getAccNum().equals(acc))
					{
						System.out.println("Enter the amount to deposit");
						Double amt = sc.nextDouble();

						SavingAccount savingAccount = new SavingAccount();
						Double deposit = savingAccount.deposit(amt, ac);
						ac.setBalance(deposit);
						System.out.println("Amount deposit successfully");

					}
				}break;
			}

			case 5:
			{
				System.out.println("Enter 1st A/C Number ");
				Integer ac1 = sc.nextInt();

				System.out.println("Enter the Amount");
				Double amt = sc.nextDouble();

				System.out.println("Enter 2st A/C Number ");
				Integer ac2 = sc.nextInt();

				for(Account ac : accountlist)
				{
					if(ac.getAccNum().equals(ac1))
					{

						SavingAccount savingAccount = new SavingAccount();
						Double withdraw = savingAccount.withdraw(amt, ac);
						ac.setBalance(withdraw);

					}
					if(ac.getAccNum().equals(ac2))
					{

						SavingAccount savingAccount = new SavingAccount();
						Double deposit = savingAccount.deposit(amt, ac);
						ac.setBalance(deposit);
						System.out.println("Amount deposit successfully");
					}
				}

				break;
			}

			case 6:
			{
				System.out.println("Enter the Account Number");
				Integer acc = sc.nextInt();

				for(Account ac : accountlist)
				{
					accountlist.remove(ac);
					System.out.println(ac);
				}
			}break;

			case 7:
			{
				System.out.println("Enter the Account Number");
				Integer acc = sc.nextInt();

				sc.nextLine();
				for(Account ac : accountlist)
				{
					if(ac.getAccNum().equals(acc))
					{

						SavingAccount savingAccount = new SavingAccount();
						System.out.println("Enter the years");
						Integer yrs = sc.nextInt();

						Double interest = savingAccount.applyinterest(yrs, ac);
						System.out.println("Interest is : " + interest);

					}
					break;
				}
			}

			case 8:
			{
				Collections.sort(accountlist);
				break;
			}

			case 9:
			{
				Collections.sort(accountlist , new DateofOpeningCompare());
				break;
			}

			case 0:
			{
				break;
			}





			default:
			}
			} while (choice != 0);
			sc.close();
		}
	}
