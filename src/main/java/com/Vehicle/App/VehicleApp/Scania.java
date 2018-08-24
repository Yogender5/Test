package com.Vehicle.App.VehicleApp;


public class Scania extends Truck{
	public Scania() {
		System.out.println("Default constructor from"+getClass().getName());
	}

	
	public void drive() {
	System.out.println("Driving the car."+getClass().getName());	
	}

	
	
	public void steer(int num) {
		System.out.println("Using the steer"+getClass().getName());
	}

	
	
	public void stop() {
		System.out.println("Car stopped."+getClass().getName());
	}
}
