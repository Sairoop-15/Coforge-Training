import { Component } from '@angular/core';

@Component({
  selector: 'app-company-dashboard',
  standalone: false,
  templateUrl: './company-dashboard.html',
  styleUrl: './company-dashboard.css',
})
export class CompanyDashboard {
  CompanyName : String
  CEO : String
  Location : String
  EmployeesCount : Number
  Revenue : Number 

  constructor() {
    this.CompanyName = "StateStreet"
    this.CEO = "Abhiram"
    this.Location = "Hyderabad"
    this.EmployeesCount = 101
    this.Revenue = 526854651
  }

}
