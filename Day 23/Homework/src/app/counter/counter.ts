import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  standalone: false,
  templateUrl: './counter.html',
  styleUrl: './counter.css',
})
export class Counter {
  count : number = 0

  increment() {
    this.count = this.count + 1
  }

  decrement() {
    this.count = this.count - 1;
  }

  reset() {
    this.count = 0
  }
}
