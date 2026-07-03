package com.coforge.day3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s = Integer.toString(n);
		String rev = new StringBuilder(s).reverse().toString();
		n = Integer.parseInt(rev);
		
		System.out.println("Reversed Integer : " + n);
		
		sc.close();
	}

}
