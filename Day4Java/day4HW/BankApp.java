package com.coforge.Day4Java.day4HW;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("SBI1001", 10000);

        account.checkBalance();

        account.deposit(5000);

        account.withdraw(3000);

        account.checkBalance();
	}

}