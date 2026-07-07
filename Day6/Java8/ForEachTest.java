package com.coforge.Day6.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		list.forEach(number -> System.out.println(number));
		System.out.println("-----------------------------------");

		list.forEach(number -> {
			if (number % 2 == 0)
				System.out.println(number);
		});
		
		list.forEach(System.out::println);

	}
}
