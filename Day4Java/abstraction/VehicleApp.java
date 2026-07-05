package com.coforge.Day4Java.abstraction;

public class VehicleApp {

	public static void main(String[] args) {
		
		VehiclePlan vehicle;
		
		vehicle = new Bike();
		vehicle.brandName();
		vehicle.noOfEngine();
		vehicle.noOfWheels();
	}

}
