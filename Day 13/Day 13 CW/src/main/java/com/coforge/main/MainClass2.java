package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.BeansConfiguration;
import com.coforge.model.Customer;

public class MainClass2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		Customer customer = (Customer) context.getBean("Customer1");
		System.out.println(customer);

	}

}
