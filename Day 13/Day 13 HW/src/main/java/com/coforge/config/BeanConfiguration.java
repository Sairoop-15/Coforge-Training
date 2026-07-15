package com.coforge.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Address;
import com.coforge.model.Student;

@Configuration
public class BeanConfiguration {

	@Bean(name = "student")
	public Student getStudnet() {
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Abhi");
		student.setSubjects(Arrays.asList("Java", "Spring Core", "Hibernate", "MySQL", "React"));
		Set<String> set = new HashSet<>(Arrays.asList("Communication", "Problem Solving", "Team Work", "Java"));
		student.setSkills(set);
		String[] subjects = { "Java", "Spring", "Hibernate", "MySQL", "React" };
		int[] marks = { 95, 90, 88, 92, 85 };
		Map<String, Integer> marksMap = new HashMap<>();
		for (int i = 0; i < subjects.length; i++) {
			marksMap.put(subjects[i], marks[i]);
		}
		student.setMarks(marksMap);
		student.setAddress(getAddress());
		return student;
	}

	@Bean(name = "address")
	public Address getAddress() {
		Address address = new Address();
		address.setCity("address1");
		address.setState("state1");
		return address;
	}
}
