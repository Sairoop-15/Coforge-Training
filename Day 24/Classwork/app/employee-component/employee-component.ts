import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-employee-component',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent {
  result = '';

  saveEmployee(data: any): void {
    this.result = `Employee Saved Successfully with Id ${data.eid} Name ${data.ename} Salary ${data.salary}`;
  }
}
