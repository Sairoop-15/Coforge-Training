import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directive',
  standalone: false,
  templateUrl: './structural-directive.html',
  styleUrl: './structural-directive.css',
})
export class StructuralDirective {
  myDivStyle: String
  myButtonStyle: {}
  message: String
  flag: boolean;
  vehicles: string[];
  selectedVehicle: String = ""

  constructor() {
    this.myDivStyle = "MyDiv"
    this.myButtonStyle = {
      backgroundColor: "blue",
      color: "white",
      padding: "10px",
      margin: "10px 0px",
      borderRadius: "10px"
    };
    this.message = "Angular Structural Directive"
    this.flag = true;
    this.vehicles = ['Car', "Bike", "Truck", "Bus"]
  }

  ShowHideDiv() {
    this.flag = !this.flag;
  }

  setSelectedVehicle(vehicle: string) {
    this.selectedVehicle = vehicle
  }

}
