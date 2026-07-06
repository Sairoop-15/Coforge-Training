package com.coforge.Day4Java.Day4CW;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		
		//Initialization
		LinkedHashSet<Integer> ar = new LinkedHashSet<>();
		
		//add elements
		ar.add(new Integer(10)); //Boxing 
		ar.add(10); //AutoBoxing
		ar.add(20);
		ar.add(20);
		ar.add(30);
		System.out.println(ar);
		
		//delete
		ar.remove(10);
		System.out.println(ar);
		
		for (Integer i: ar) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
