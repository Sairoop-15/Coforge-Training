import { Component } from '@angular/core';

interface Product {
  productId: number;
  productName: string;
  category: string;
  price: number;
}

@Component({
  selector: 'app-product-catalog',
  standalone: false,
  templateUrl: './product-catalog.html',
  styleUrl: './product-catalog.css',
})
export class ProductCatalog {
    products: Product[] = [
    { productId: 101, productName: 'Laptop', category: 'Electronics', price: 65000 },
    { productId: 102, productName: 'Mobile', category: 'Electronics', price: 25000 },
    { productId: 103, productName: 'Keyboard', category: 'Accessories', price: 1200 },
    { productId: 104, productName: 'Mouse', category: 'Accessories', price: 800 },
    { productId: 105, productName: 'Monitor', category: 'Electronics', price: 15000 },
    { productId: 106, productName: 'Printer', category: 'Office', price: 9000 },
    { productId: 107, productName: 'Headphones', category: 'Accessories', price: 2500 },
    { productId: 108, productName: 'Smart Watch', category: 'Wearables', price: 7000 },
    { productId: 109, productName: 'Speaker', category: 'Audio', price: 3500 },
    { productId: 110, productName: 'Webcam', category: 'Accessories', price: 2200 }
  ];
}
