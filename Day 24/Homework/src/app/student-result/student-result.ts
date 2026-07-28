import { Component } from '@angular/core';

interface Student {
  id: number;
  name: string;
  marks: number;
}

@Component({
  selector: 'app-student-result',
  standalone: false,
  templateUrl: './student-result.html',
  styleUrl: './student-result.css',
})
export class StudentResult {
  students: Student[] = [
    { id: 101, name: 'Sai', marks: 82 },
    { id: 102, name: 'Rahul', marks: 28 },
    { id: 103, name: 'Priya', marks: 67 },
    { id: 104, name: 'Anil', marks: 35 },
    { id: 105, name: 'Sneha', marks: 90 },
    { id: 106, name: 'Kiran', marks: 18 },
    { id: 107, name: 'Arjun', marks: 54 },
    { id: 108, name: 'Pooja', marks: 33 },
    { id: 109, name: 'Ravi', marks: 76 },
    { id: 110, name: 'Neha', marks: 40 }
  ];

  totalStudents: number = this.students.length;

  passCount: number = this.students.filter(student => student.marks >= 35).length;

  failCount: number = this.students.filter(student => student.marks < 35).length;

}
