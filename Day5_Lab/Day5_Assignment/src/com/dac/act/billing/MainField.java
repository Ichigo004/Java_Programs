package com.dac.act.billing;
import java.util.Scanner;
public class MainField {

		
//		Item items[] = new Item[3];
//		
//		 items[0] = new Item("100", "Potato", 50.0, 10);
//	     items[1] = new Item("101", "Tomato", 30.0, 20);
//	     items[2] = new Item("102", "Onion", 20.0, 15);
//	     
//	     Scanner sc  =new Scanner(System.in);
		
		 private static Item[] stock = new Item[5];
		    private static Item[] purchasedItems = new Item[10];
		    private static int purchaseCount = 0;

		    static {
		        // Initial stock
		        stock[0] = new Item("001", "Apple", 0.5, 100);
		        stock[1] = new Item("002", "Banana", 0.3, 150);
		        stock[2] = new Item("003", "Orange", 0.4, 80);
		        stock[3] = new Item("004", "Mango", 1.0, 50);
		        stock[4] = new Item("005", "Grapes", 2.0, 60);
		    }

		    public static void displayStock() {
		        System.out.println("Current Stock:");
		        for (Item item : stock) {
		            if (item != null) {
		                System.out.println(item);
		            }
		        }
		    }

		    public static void buyItem(String itemCode, int quantity) {
		        for (Item item : stock) {
		            if (item != null && item.getItemCode().equals(itemCode)) {
		                if (item.getQuantity() >= quantity) {
		                    item.reduceQuantity(quantity);
		                    purchasedItems[purchaseCount++] = new Item(item.getItemCode(), item.getItemName(), item.getPrice(), quantity);
		                    System.out.println("Purchased " + quantity + " of " + item.getItemName());
		                } else {
		                    System.out.println("Not enough stock for " + item.getItemName());
		                }
		                return;
		            }
		        }
		        System.out.println("Item code not found.");
		    }

		    public static void displayBill() {
		        System.out.println("Bill:");
		        double total = 0;
		        for (int i = 0; i < purchaseCount; i++) {
		            Item purchasedItem = purchasedItems[i];
		            double itemTotal = purchasedItem.getPrice() * purchasedItem.getQuantity();
		            total += itemTotal;
		            System.out.println(purchasedItem.getItemName() + " | Quantity: " + purchasedItem.getQuantity() + " | Total: $" + itemTotal);
		        }
		        System.out.println("Total Amount: $" + total);
		    }

		    
		    
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int choice;
		        
		        do {
		            System.out.println("\nMenu:");
		            System.out.println("1. Display Stock");
		            System.out.println("2. Buy Item by Item Code");
		            System.out.println("3. Display Bill");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    displayStock();
		                    break;
		                case 2:
		                    System.out.print("Enter item code: ");
		                    String itemCode = scanner.next();
		                    System.out.print("Enter quantity: ");
		                    int quantity = scanner.nextInt();
		                    buyItem(itemCode, quantity);
		                    break;
		                case 3:
		                    displayBill();
		                    break;
		                case 4:
		                    System.out.println("Exiting...");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 4);

		        scanner.close();
		    
	}

}
