package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.config.BeansConfiguration;
import com.coforge.model.Customer;

public class MainClass1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Customer customer = (Customer) context.getBean("Customer1");
		System.out.println(customer);
	}

}
