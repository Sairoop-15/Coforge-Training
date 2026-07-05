package com.coforge.Day4Java.abstraction;

public class Square extends Figure {
	public Square() {
		super(10);
	}
	
	@Override
	public void area() {
		System.out.println("Area of Square is : " + super.getSide() * super.getSide());
	}

}

