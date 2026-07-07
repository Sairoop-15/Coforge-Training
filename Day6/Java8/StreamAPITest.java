package com.coforge.Day6.Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPITest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println(evenList);

		long cnt = list.stream().filter(n -> n % 2 == 0).count();

		System.out.println(cnt);

		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		list = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList());

		System.out.println(list);

		List<String> names = Arrays.asList("sai", "Teja", "Neeraj", "Ram");

		names.stream().filter(s -> s.contains("j")).map(s -> s.length()).forEach(System.out::println);

		Map<Integer, String> map = new HashMap<>();
		map = names.stream().collect(Collectors.toMap(x -> x.length(), x -> x, (old, newval) -> newval));

		System.out.println(map);

	}
}
