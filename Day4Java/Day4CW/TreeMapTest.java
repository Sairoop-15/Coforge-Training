package com.coforge.Day4Java.Day4CW;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
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
