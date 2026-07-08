package com.coforge.day6_java.classwork.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		list.forEach(n -> System.out.println(n));

		System.out.println("-------------------------------");
		list.forEach(n -> {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		});
		System.out.println("-------------------------------");

		list.forEach(System.out::println);
	}
}
