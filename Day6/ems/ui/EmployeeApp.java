package com.coforge.ems.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.ems.controller.EmployeeController;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeApp {
	private static EmployeeController controller = new EmployeeController();
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		
		Scanner sc = new Scanner(System.in);
		String confirmation = "",result;
		Employee employee = null;
		
		do {
			System.out.println("1.Create 2.Update 3.Delete 4.Find 5.FindAll 6.Exit");
			System.out.println("Enter your Choice :");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter Employee id, Employee Name, Email, Salary and Department Number ");
			employee = new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
			result = controller.createEmployee(employee);
			System.out.println(result);
			break;
			case 2:System.out.println("Enter Employee id, Employee Name, Email, Salary and Department Number to update");
			employee = new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
			result = controller.updateEmployee(employee);
			System.out.println(result);
				break;
			case 3:System.out.println("Enter Employee Id of the Employee to Delete");
			int empId = sc.nextInt();
			result = controller.deleteEmployee(empId);
			System.out.println(result);
				break;
			case 4:System.out.println("Enter The Employee Id of Employee to Search : ");
			int id = sc.nextInt();
			result = controller.findEmployee(id);
			System.out.println(result);
				break;
			case 5: result = controller.findAllEmployee();
			System.out.println(result);
				break;
			case 6:
				System.exit(0);
				break;
			}
			
			System.out.println("Do you want to Continue Yes|No");
			confirmation = sc.next();
			
		}while(confirmation.equalsIgnoreCase("yes"));
		
		sc.close();
		
	}
}
