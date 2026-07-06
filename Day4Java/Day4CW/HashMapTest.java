package com.coforge.Day4Java.Day4CW;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Java");
		map.put(20, "Sai");
		map.put(40, "Hi");

		System.out.println(map);
		map.put(10, "Hola");
		
		System.out.println(map);
		map.remove(10);
		
		System.out.println(map);
		System.out.println(map.get(20));
	}
}
