package com.coforge.Day4Java.Day4CW;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			try {
				throw new InvalidAgeException("You are not eligible to vote.");
			} catch (InvalidAgeException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
