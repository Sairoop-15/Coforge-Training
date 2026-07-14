package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee(2011,"Rishi","Rishi@gmail.com",2161,10);
//		session.save(employee); 
//		session.update(employee);
//		Employee emp = session.get(Employee.class, 2010);
		session.delete(employee);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("Employee object deleted!");
	}

}
