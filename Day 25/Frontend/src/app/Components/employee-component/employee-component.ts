import { Component } from '@angular/core';
import { EmployeeService } from '../../Service/employee-service';
import { Employee } from '../../Model/Employee';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css'
})
export class EmployeeComponent {

  employee: Employee;
  employees: Employee[] = [];   // <-- Add this
  result = '';

  constructor(private employeeService: EmployeeService) {
    this.employee = new Employee();
  }

  saveEmployee(data: any) {

    this.employee.empId = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    this.employee.email = data.email;
    this.employee.deptNo = data.deptNo;

    this.employeeService.saveEmployee(this.employee).subscribe({
      next: (res) => {
        this.result = res;
      },
      error: (err) => {
        this.result = err.error;
      }
    });

  }

  updateEmployee(data: any) {

    this.employee.empId = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    this.employee.email = data.email;
    this.employee.deptNo = data.deptNo;

    this.employeeService.updateEmployee(this.employee).subscribe({
      next: (res) => {
        this.result = res;
      },
      error: (err) => {
        this.result = err.error;
      }
    });

  }

  deleteEmployee(data: any) {

    this.employeeService.deleteEmployee(data.empId).subscribe({
      next: (res) => {
        this.result = res;
      },
      error: (err) => {
        this.result = err.error;
      }
    });

  }

  findEmployee(data: any) {

    this.employeeService.findEmployee(data.empId).subscribe({

      next: (res) => {

        this.employee = res;
        this.result = "Employee Found Successfully";

      },

      error: (err) => {

        this.result = err.error;

      }

    });

  }

  findAllEmployees() {

    this.employeeService.findAllEmployees().subscribe({

      next: (res) => {

        this.employees = res;
        this.result = "Employees Loaded Successfully";

      },

      error: (err) => {

        this.result = err.error;

      }

    });

  }

}