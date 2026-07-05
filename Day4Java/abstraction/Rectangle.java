package com.coforge.Day4Java.abstraction;

public class Rectangle extends Figure {
	public Rectangle() {
		super(10,15);
	}
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle is : " + super.getLength() * super.getBreadth());
	}
	
}
