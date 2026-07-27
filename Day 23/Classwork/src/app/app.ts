import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  name : string
  age : Number
  email : String
  imagePath : String
  width : Number
  height : Number
  myStyle: any 
  fname : String = "";
  date: Date = new Date(2005, 4, 21);


  constructor() {
    this.name = "Sai";
    this.age = 21;
    this.email = "sai@gmail.com";
    this.imagePath = "image.png";
    this.width = 100;
    this.height = 100;
    this.myStyle = {"color" : "green", "font-size" : "20px"};
  }

  getAddition(a : number, b : number) : number {
    return a + b;
  }

changeName() {
  if (this.name === "Sai") {
    this.name = "Sairoop";
  } else {
    this.name = "Sai";
  }
}

ZoomInOut() {
  if(this.myStyle.color === "green")
  this.myStyle = {color : "blue", fontSize : "30px"};
else{
  this.myStyle = {color : "green", fontSize : "20px"};
}
}

}
