package com.coforge.Day4Java.exception;

import java.lang.reflect.Array;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
//		int a = 10/0;
			
		int a = Integer.parseInt("sums");
		System.out.println(a);
		
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("AFter Exception");
			
		}
		
//		int a1 = Integer.parseInt(null, 10); ArithmeticException
		
//		int[] arr = {10,20,30};
//		
//		System.out.println(arr[10]); IndexOutofBounds
		
//		int[] arr = new int[-1]; NegativeArraySize
		
//		String s = null;
//		
//		System.out.println(s.length()); NullPointerException

	}

}
