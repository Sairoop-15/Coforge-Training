package com.coforge.Day6.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface MyInterface {
	public void myMethod1();

	default void myMethod2() {
		System.out.println("This is a default Method");
	}

	static void myMethod3() {
		System.out.println("This is a default Method");
	}
}

public class Java8InterfaceTest implements MyInterface {

	@Override
	public void myMethod1() {
		System.out.println("Interface Method");
	}

	@Override
	public void myMethod2() {
		System.out.println("Interface MyMethod2");
	}

//	@Override
//	public void myMethod3() {
//		System.out.println("Interface MyMethod3"); cannot be Overridden 
//	}
	
	public static void main(String[] args) {
		MyInterface.myMethod3();
		MyInterface inter = new Java8InterfaceTest();
		inter.myMethod2();
		
	}

}
