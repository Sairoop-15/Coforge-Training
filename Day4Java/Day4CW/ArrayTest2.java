package com.coforge.Day4Java.Day4CW;
import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("Enter 5 Values");
		for (int i = 0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println("Element at index " + i + ": " + arr[i]);
		}

		System.out.println("Sum of array elements: " + sum);
		sc.close();
	}
}
