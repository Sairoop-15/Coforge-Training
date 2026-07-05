package com.coforge.Day4Java.day4HW;

public class Account {
	private String accNO;
    private double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Deposited Successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Account Number : " + accNO);
        System.out.println("Available Balance : " + balance);
    }
}