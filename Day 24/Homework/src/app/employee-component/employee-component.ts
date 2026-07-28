import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent {
   showEmployee: boolean = true;

  employee = {
    id: 101,
    name: 'Sai',
    department: 'IT',
    salary: 50000
  };

  toggleEmployee() {
    this.showEmployee = !this.showEmployee;
}
}
