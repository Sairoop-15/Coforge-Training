import { Component } from '@angular/core';

@Component({
  selector: 'app-product-catalog',
  standalone: false,
  templateUrl: './product-catalog.html',
  styleUrl: './product-catalog.css',
})
export class ProductCatalog {
  ProductName : String
  Price : Number
  Category : String
  Brand : String 
  Image : String
  Availability : any 

  constructor() {
    this.ProductName = "Shampoo"
    this.Price = 499
    this.Category = "Hygeine"
    this.Brand = "Vatika"
    this.Image = "shampoo.png"
    this.Availability = "Yes"
  }

  
}
