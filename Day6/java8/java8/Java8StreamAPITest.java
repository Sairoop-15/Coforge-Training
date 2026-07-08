package com.coforge.day6_java.classwork.java8;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamAPITest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15);

		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count);

		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		list.stream().map(n -> n * 2).forEach(n -> System.out.println(n));

		List<Integer> list2 = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList());
		System.out.println(list2);
		
		
		List<String> names = Arrays.asList("Neeraj", "Teja", "Pranayy", "Sureshhh");
		
		List<String> ans = names.stream().filter(str -> str.contains("a") && str.length() > 4).collect(Collectors.toList());
		System.out.println(ans);
		
		Date date = new Date(count);
		System.out.println(date);
		
		LocalDate dat = LocalDate.now();
		System.out.println(dat);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		//converting list to map
		Map<Integer, String> map = names.stream().collect(Collectors.toMap(name -> name.length(), name -> name));
	    System.out.println(map);
	}
}
