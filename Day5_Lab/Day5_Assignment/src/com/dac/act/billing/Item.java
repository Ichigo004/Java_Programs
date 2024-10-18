package com.dac.act.billing;

public class Item {
    private String itemCode;
    private String itemName;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Item(String itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return itemCode + " - " + itemName + " | Price: $" + price + " | Available: " + quantity;
    }
}
























//
//public class Item {
//	
//	private String ItemCode;
//	private String ItemName;
//	private double Price;
//	private int Quantity;
//	
//
//	public Item(String itemCode,String ItemName ,double Price,  int quantity) {
//		this.ItemCode = itemCode;
//		this.ItemName = ItemName;
//		this.Price = Price;
//		this.Quantity = quantity;
//	}
//	
//	
//	
//	public String getItemcode()
//	{
//		return ItemCode;
//	}
//	public String getitemname()
//	{
//		return ItemName;
//	}
//	public double getprice()
//	{
//		return Price;
//	}
//	public int getquantity()
//	{
//		return Quantity;
//	}




	

	

	
	
	
