package com.cdac.classes;

import java.time.LocalDate;
import java.util.Objects;

import com.cdac.enums.Genre;

public class Book {
	
	private String bookTitle;
	private String authorName;
	private Double price;
	private LocalDate publishedDate;
	private Integer quantity;
	
	
	public Book() {
		super();
	}


	public Book(String bookTitle, String authorName, Double price, LocalDate publishedDate, Integer quantity) {
		super();
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.publishedDate = publishedDate;
		this.quantity = quantity;
	}


	public String getBookTitle() {
		return bookTitle;
	}

	

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getAuthorName() {
		return authorName;
	}


	public Double getPrice() {
		return price;
	}


	public LocalDate getPublishedDate() {
		return publishedDate;
	}


	public Integer getQuantity() {
		return quantity;
	}

	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", authorName=" + authorName + ", price=" + price + ", publishedDate="
				+ publishedDate + ", quantity=" + quantity + 
				 "]";
	}
	
	
	public int hashCode()
	{
		return Objects.hash(bookTitle);
	}
	
	
	public boolean equal(Object objects)
	{
		if(objects == null)
		{
			return false;
		}
		if(this == objects)
		{
			return true;
		}
		if(this.getClass() != objects.getClass())
		{
			return false;
		}
		
		Book book = (Book) objects;
		return bookTitle.equals(book.bookTitle);
	}
	
	
}
