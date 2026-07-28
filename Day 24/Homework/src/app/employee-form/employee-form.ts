import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-form',
  standalone: false,
  templateUrl: './employee-form.html',
  styleUrl: './employee-form.css',
})
export class EmployeeForm {
    employee = {
    empId: '',
    empName: '',
    email: '',
    mobile: '',
    department: '',
    gender: '',
    doj: '',
    salary: ''
  };

  registerEmployee() {
    alert("Employee Registered Successfully!");
    console.log(this.employee);
  }
}
