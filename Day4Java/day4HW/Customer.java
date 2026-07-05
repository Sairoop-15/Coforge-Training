package com.coforge.Day4Java.day4HW;

public class Customer {
	int id;
    String name;
    Cart cart;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.cart = new Cart();
    }
}