package com.coforge.day6_java.classwork.java8;

interface Calculator {
	public int calc(int a, int b);
}

public class LamdaTest {

	public static void main(String[] args) {
		Calculator calculator = (a, b) -> a + b;
		System.out.println(calculator.calc(10, 20)); // this is method is direct implementation for calc
		// need of functional interface - interface should has only one fun,
		//  with the lambda expression
		// java will confuse if interface has more than one method

		calculator = (a, b) -> a - b;
		System.out.println(calculator.calc(10, 20));
	}

}

// we need to implement like this without lambda function
//class Addtion implements Calculator {
//
//	@Override
//	public int calc(int a, int b) {
//		return a + b;
//	}
//	
//}
//
//class Subtraction implements Calculator {
//
//	@Override
//	public int calc(int a, int b) {
//		return a - b;
//	}
//	
//}
