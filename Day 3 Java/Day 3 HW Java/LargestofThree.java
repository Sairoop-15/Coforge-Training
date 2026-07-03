package com.coforge.day3;

import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Largest of 3 Numbers is :" + Math.max(a, Math.max(b, c)));
		
		sc.close();

	}

}
