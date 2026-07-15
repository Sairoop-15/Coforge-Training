package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Address;
import com.coforge.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee) context.getBean("employee1");
		System.out.println(employee);
		
		Employee employee1 = (Employee) context.getBean("employee2");
		System.out.println(employee1);

		int a = (int) context.getBean("myInt");
		System.out.println(a);
		
		Address ad1 = (Address) context.getBean("address1");
		Address ad2 = (Address) context.getBean("address2");
		System.out.println(ad1);
		System.out.println(ad2);
	}

}
