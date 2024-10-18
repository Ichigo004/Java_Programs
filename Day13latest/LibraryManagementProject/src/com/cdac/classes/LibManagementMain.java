package com.cdac.classes;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cdac.enums.Genre;
import com.cdac.exceptions.BookNotfoundException;
import com.cdac.exceptions.DuplicateBookException;
import com.cdac.validations.DateValidate;

public class LibManagementMain {

	public static void main(String[] args) throws ParseException {

//		Set<Book> bookset = new HashSet<Book>();
		Map<String , Book> bookset = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Integer choice;


		do {
			System.out.println("****Lib Book Management****");	
			System.out.println("1 Add Books");	
			System.out.println("2 Display all the books");	
			System.out.println("3 Allot book to student");	
			System.out.println("4 Take book return");	
			System.out.println("5 Remove Book");	
			System.out.println("0 Exit");

			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {



				sc.nextLine();
				System.out.println("Enter the title of the book");
				String bookT = sc.nextLine();
				boolean flag = false;
				for(Book b : bookset)
				{
					flag = true;
					try
					{
						if(b.getBookTitle().equals(bookT))
						{
							throw new DuplicateBookException("Duplicate books cannot be found");
						}
					}

					catch(DuplicateBookException d)
					{
						d.printStackTrace();
						System.out.println(d.getLocalizedMessage());
						flag = false;
						break;
					}
				}
				System.out.println("Books Type AUTO , SCI , ROMCOM, ACT , COM ");
				String type = sc.nextLine().toUpperCase();
				Genre genre = Genre.valueOf(type);

				//				sc.nextLine();
				System.out.println("Enter the Author Name");
				String name = sc.nextLine();

				//				sc.nextLine();
				System.out.println("Enter the Price of the book");
				Double price = sc.nextDouble();

				sc.nextLine();
				System.out.println("Enter the Published date of the Book");
				String published = sc.nextLine();
				LocalDate publish = DateValidate.getdate(published);

				System.out.println("Enter the Quantity of the Book");
				Integer quantity = sc.nextInt();

				if(bookset != null)
				{
					Book book = new Book(bookT, name, price, publish, quantity);
					bookset.add(book);
					System.out.println("Book Added to your Library Successfully ");
				}

				break;				
			}

			case 2: 
			{
				for(Book b : bookset)
				{
					System.out.println(b);
				}
				break;
			}

			case 3:
			{
				sc.nextLine();
				System.out.println("enter book title");
				String title = sc.nextLine();
				boolean found = false;
				for(Book b : bookset)
				{
					try
					{
						if(b.getBookTitle() != title)
						{
							throw new BookNotfoundException("book not found");
						}

					}
					catch(BookNotfoundException bo)
					{
						bo.printStackTrace();
						System.out.println(bo.getLocalizedMessage());
					}
					if(b.getBookTitle().equals(title))
					{
						Integer quant = b.getQuantity() - 1;
						b.setQuantity(quant);
						System.out.println(title + " has been allocated to You");
						break;
					}
				}
				break;
			}

			case 4:
			{
				sc.nextLine();
				System.out.println("Enter the title");
				String title = sc.nextLine();

				for(Book b : bookset)
				{
					try
					{
						if(b.getBookTitle() != title)
						{
							throw new BookNotfoundException("book not found");
						}

					}
					catch(BookNotfoundException bo)
					{
						bo.printStackTrace();
						System.out.println(bo.getLocalizedMessage());
					}
					if(b.getBookTitle().equals(title))
					{
						Integer quant = b.getQuantity() + 1;
						b.setQuantity(quant);
						System.out.println("the book has been return ");
					}
				}

				break;
			}

			case 5:
			{
				sc.nextLine();
				System.out.println("Enter the book title");
				String title = sc.nextLine();

				for(Book b : bookset)
				{
					try
					{
						if(b.getBookTitle() != title)
						{
							throw new BookNotfoundException("book not found");
						}

					}
					catch(BookNotfoundException bo)
					{
						bo.printStackTrace();
						System.out.println(bo.getLocalizedMessage());
					}
					if(b.getBookTitle().equals(title))
					{
						bookset.remove(b);

						System.out.println("Book delete from the library management");
					}
				}
				break;
			}

			case 0 :
			{
				break;
			}

			default:
			}

		} while (choice != 0);
	}
}
