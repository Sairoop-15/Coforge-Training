package com.coforge.Day4Java.Day4CW;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		//Initialization
		TreeSet<Integer> ar = new TreeSet<>(Collections.reverseOrder());
		
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
