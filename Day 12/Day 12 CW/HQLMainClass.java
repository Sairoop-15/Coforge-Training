package com.coforge.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Employee;

public class HQLMainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/*
		HQL Select
		Query query = session.createQuery("from Employee"); // select * from employee;
		List<Employee> employees = query.list();
		System.out.println(employees);
		*/
		
		/*
		HQL STATIC SELECT
		Query query = session.createQuery("from Employee where eid = 101"); // Here eid is bean property name;
		List<Employee> employees = query.list();
		System.out.println(employees);
		*/
		
		/*
		HQL DYNAMIC SELECT
		Query query = session.createQuery("from Employee where eid = :empId"); // Use setParameter property;
		query.setParameter("empId", 102);
		List<Employee> employees = query.list();
		System.out.println(employees);
		*/
		
		/*
		SPECIFIC COLUMN SELECT
		Query query = session.createQuery("select empname from Employee"); // Here eid is bean property name;
		List<String> employees = query.list();
		System.out.println(employees);
		*/
		
		/*
		HQL UPDATE
		Query query = session.createQuery("update Employee set ename = :empName where empId = :idd"); // Here eid is bean property name;
		query.setParameter("empName", "Raghav");
		query.setParameter("idd", 101);
		int n = query.executeUpdate();
		if(n == 1)
				System.out.println("Employee object Updated");
		else
			System.out.println("Failure");
		*/
		
		//HQL DELETE
		Query query = session.createQuery("delete from Employee where eid = :id"); // Here eid is bean property name;
		query.setParameter("id", 2010);
		int n = query.executeUpdate();
		if(n == 1)
				System.out.println("Employee object Updated");
		else
			System.out.println("Failure");
		
		
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
