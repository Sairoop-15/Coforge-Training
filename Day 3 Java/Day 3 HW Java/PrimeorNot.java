package com.coforge.day3;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean  b = false;
		int n = sc.nextInt();
		
		for (int i = 0; i*i <= n; i++) {
			if (n % i == 0)
				b = true;
		}
		
		if (b)
			System.out.println(n + " is a not Prime Number");
		else
			System.out.println(b + " is not Prime Number");
		
		sc.close();
	}

}
