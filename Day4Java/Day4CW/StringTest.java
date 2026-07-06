package com.coforge.Day4Java.Day4CW;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("java");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.indexOf('J'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('B'));
		
		String s3 = s1.concat(" World");
		System.out.println(s3);
		
		System.out.println(s3.substring(3));// a Wo
	}

}
