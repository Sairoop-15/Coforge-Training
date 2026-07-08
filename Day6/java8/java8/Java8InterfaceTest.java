package com.coforge.day6_java.classwork.java8;

interface MyInterface {
	public void myMethod1();

	// from java 8 version it is available
	default void myMethod2() {
		System.out.println("you can provide the definiton if it is menctioned as default");
	}

	static void myMethod3() {
		System.out.println("you can provide the definiton if it is defined as static");
	}
}

public class Java8InterfaceTest implements MyInterface {

	@Override
	public void myMethod1() {
		System.out.println("abstract method definition");
	}

	public void myMethod2() { // default method can be overridden
		System.out.println("you can provide the definiton if it is menctioned as default" + "overridden");
	}

	// @Override static method cannot be overridden
//	public void myMethod3() { 
//		System.out.println("you can provide the definition if it is defined as static" + "overridden");
//	}

}
