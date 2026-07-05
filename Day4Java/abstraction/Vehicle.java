package com.coforge.Day4Java.abstraction;

public abstract class Vehicle implements VehiclePlan {
	public void noOfEngine() {
		System.out.println("Vehicle has 1 Engine");
	}
	
	public abstract void noOfWheels();
	public abstract void brandName();

}
