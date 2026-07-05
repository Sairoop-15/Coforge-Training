package com.coforge.Day4Java.abstraction;

public class AreaCalculatorApp {

	public static void main(String[] args) {
//		Square square = new Square();
//		Rectangle rectangle = new Rectangle();
//		Triangle triangle = new Triangle();
//		
//		square.area();
//		rectangle.area();
//		triangle.area();
		AreaPlan figure;
		
		figure = new Square();
		figure.area();
		
		figure = new Rectangle();
		figure.area();
		
		figure = new Triangle();
		figure.area();
		
//		Rectangle r = (Rectangle) new Figure(10);
		
	}

}
