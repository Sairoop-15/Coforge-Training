package com.coforge.Day4Java.abstraction;

public class Test implements C {

	public static void main(String[] args) {
		Test t = new Test();

		t.sum();
	}

	public void sum() {
		System.out.println(A.a + B.a);
	}
}
