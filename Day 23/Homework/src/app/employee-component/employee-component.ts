import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent {
  EmployeeID : Number
  Name : String
  Department : String
  Salary : Number

  constructor() {
    this.EmployeeID = 101;
    this.Name = "Abhiram";
    this.Department = "Developemnt";
    this.Salary = 10000;
  }
}
