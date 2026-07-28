import { Component } from '@angular/core';
import { CalculatorService } from '../calculator-service';

@Component({
  selector: 'app-subtraction',
  standalone: false,
  templateUrl: './subtraction.html',
  styleUrl: './subtraction.css',
})
export class Subtraction {
  result: String
  num1: number = 0;
  num2: number = 0;
  constructor(private calculatorComponent: CalculatorService) {
    this.result = "";
  }

  getSubtraction() {
    this.result = this.calculatorComponent.subtract(this.num1, this.num2).toString();
  }
}
