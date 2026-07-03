package com.coforge.day3;

public class Product {
	private int id;
	private String name;
	private int price;
	private int quantity;
	
	public int totalPrice() {
		return this.price * this.quantity;
	}
	
	public void bill() {
		System.out.println("The total bill for the product is +" + this.totalPrice());
	}
}
