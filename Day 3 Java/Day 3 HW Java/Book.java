package com.coforge.day3;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private int price;

	
	public Book(int bookId, String title, String author, int price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public void display() {
		System.out.println("Book id : " +  this.bookId);
		System.out.println("Book Title : " + this.title);
		System.out.println("Book Author : " + this.author);
		System.out.println("Book Price : " + this.price);
	}

}
