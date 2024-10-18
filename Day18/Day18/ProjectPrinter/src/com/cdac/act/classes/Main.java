package com.cdac.act.classes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.cdac.act.enums.PrinterType;

public class Main {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the FileName");
			String filename = sc.nextLine();
			File file = new File(filename);

			if(!file.exists())
			{
				file.createNewFile();
			}
			else
			{
				System.out.println("File already exists");
			}

			Map<String , Printer> printmap = FileUtils.readfile(filename);
			
			Integer choice;
			
			do {

				System.out.println("***Printer Management System***");
				System.out.println("1.Add Printer");
				System.out.println("2.Update Printer Price");
				System.out.println("3.Print all Printers");
				System.out.println("4.Display printers sorted by Prices");
				System.out.println("5.Filter by printerType");
				System.out.println("6.Remove a book");
				System.out.println("7. Show printer by PrinterType");
				System.out.println("0.Save in file and Exit");
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				
				switch (choice) {
				case 1: {
					
	                    
	                    System.out.print("Enter Serial No: ");
	                    String serialNo = sc.nextLine();
	                    System.out.print("Enter Model No: ");
	                    String modelNo = sc.nextLine();
	                    System.out.print("Enter Price: ");
	                    Double price = sc.nextDouble();
	                    System.out.print("Enter Printer Type (LASER, INKJET): ");
	                    PrinterType printerType = PrinterType.valueOf(sc.next().toUpperCase());
	                    System.out.print("Enter Manufacturing Date (YYYY-MM-DD): ");
	                    LocalDate manufacturingDate = LocalDate.parse(sc.next());
	                    Printer newPrinter = new Printer(serialNo, modelNo, price, printerType, manufacturingDate);
	                    printmap.put(serialNo, newPrinter);
	                    System.out.println("Printer added successfully.");
	                    break;
				}

				case 2:
				{
					sc.nextLine();
					System.out.println("Enter your SerialNo ");
					String serialno = sc.nextLine();

					for(Printer p  : printmap.values() )
					{
						if(p.getSerialNo().equals(serialno))
						{
							sc.nextLine();
							System.out.println("Enter the Price");
							Double price = sc.nextDouble();
							p.setPrice(price);
							System.out.println("Price Updated successsfully");
						}
					}break;
				}
				
				case 3:
				{
					printmap.values().forEach(System.out::println);
					break;
				}

				case 4: 
				{
					printmap.values().stream()
					.sorted(Comparator.comparing(Printer::getPrice).reversed())
					.forEach(System.out::println);
					break;
				}

				case 5 :
				{
					sc.nextLine();
					System.out.println("Enter the Printer type (LASER, INKJET, DOTMATRIX):");
					String type = sc.nextLine().toUpperCase();

					try {
						PrinterType printerType = PrinterType.valueOf(type); // Convert user input to PrinterType enum
						printmap.values().stream()
						.filter(p -> p.getPrinterType().equals(printerType)) // Compare with the specific type

						.forEach(System.out::println);
					} catch (IllegalArgumentException e) {
						System.out.println("Invalid printer type. Please enter a valid type (LASER, INKJET, DOTMATRIX).");
					}
					break;
				}

				case 6:
				{
					sc.nextLine();
					System.out.println("Enter you Serial number");
					String serialno = sc.nextLine();
					printmap.remove(serialno);
					System.out.println("Remove Successfully");
					break;
				}

				case 7:
				  {
	                    Map<PrinterType, List<Printer>> groupedByType = printmap.values().stream()
	                            .collect(Collectors.groupingBy(Printer::getPrinterType));
	                    groupedByType.forEach((type, printers) -> {
	                        System.out.println("\nPrinter Type: " + type);
	                        printers.forEach(System.out::println);
	                    });
	                    break;
				  }
				case 0:
				{
					try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream (filename)))
					{
						oos.writeObject(printmap);
						System.out.println("Printers saved to file. Exiting...");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					break;
				}
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				
			
				
			}while(choice != 0);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
