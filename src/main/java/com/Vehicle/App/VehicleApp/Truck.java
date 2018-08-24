package com.Vehicle.App.VehicleApp;


public class Truck implements Vehicle{

	public Truck() {
		System.out.println("Constrcutor for class Truck");
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
