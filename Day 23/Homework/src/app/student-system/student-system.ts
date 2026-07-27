import { Component } from '@angular/core';

@Component({
  selector: 'app-student-system',
  standalone: false,
  templateUrl: './student-system.html',
  styleUrl: './student-system.css',
})
export class StudentSystem {
  ImgUrl : String 
  Name : String 
  Course : String 
  College : String 

  constructor() {
    this.ImgUrl = "image.png"
    this.Name = "Keerthi"
    this.Course = "CSE"
    this.College = "VNRVJIET"
  }
}
