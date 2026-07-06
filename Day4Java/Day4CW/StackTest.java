package com.coforge.Day4Java.Day4CW;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.add(20);
		st.push(30);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
	}
	
}
