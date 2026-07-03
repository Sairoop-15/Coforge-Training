package com.coforge.day3;

import java.util.Scanner;

public class SumofNos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res = 0;
		
		for (int i = 0; i <= n; i++)
			res += i;
		
		System.out.println("Sum of Numbers is : " + res);
		sc.close();
	}
}
