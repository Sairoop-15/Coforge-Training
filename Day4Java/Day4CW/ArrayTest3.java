package com.coforge.Day4Java.Day4CW;
import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {10,20,30,40,50};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println("Element at index " + i + ": " + arr[i]);
		}

		System.out.println("Sum of array elements: " + sum);
		sc.close();
	}
}
