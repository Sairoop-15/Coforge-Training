package com.coforge.Day4Java.abstraction;

public class Triangle extends Figure {
	public Triangle() {
		super(10L,15L);
	}

	@Override
	public void area() {
		System.out.println("Area of Triangle is : " + 0.5 * super.getBase() * super.getHeight());
	}

}

