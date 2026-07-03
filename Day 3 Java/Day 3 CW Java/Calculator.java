package com.coforge.day3;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		String confirmation = "";
		
		do {
		System.out.println("Enter Two Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Exit");
		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			res = a + b;
			System.out.println("Addition : " + res);
			break;
		case 2:
			res = a - b;
			System.out.println("Subraction : " + res);
			break;
		case 3:
			res = a * b;
			System.out.println("Multiplication : " + res);
			break;
		case 4:
			res = a / b;
			System.out.println("Division : " + res);
			break;
		case 5:
			System.exit(0);
			}
		
		System.out.println("Do you want to Continue Yes|No");
		confirmation = sc.next();
	}while(confirmation.equalsIgnoreCase("Yes"));
		
		sc.close();
	}
}
