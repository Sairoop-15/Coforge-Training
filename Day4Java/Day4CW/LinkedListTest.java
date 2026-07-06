package com.coforge.Day4Java.Day4CW;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		//Initialization
		LinkedList<Integer> ar = new LinkedList<>();
		
		//add elements
		ar.add(new Integer(10)); //Boxing 
		ar.add(10); //AutoBoxing
		ar.add(20);
		ar.add(20);
		ar.add(30);
		System.out.println(ar);
		System.out.println(ar.get(3));
		
		//delete
		ar.remove(3);
		System.out.println(ar);
		
		//update 
		ar.set(1, 497);
		System.out.println(ar);
		
		//Traverse Array List
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		for (Integer i: ar) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
