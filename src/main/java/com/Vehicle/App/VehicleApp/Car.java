package com.Vehicle.App.VehicleApp;

import lombok.Getter;

@Getter
public class Car implements Vehicle{
	private int wheels;
	private int doors;
	
	// Setters and getter methods starts here
	
	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public int getDoors() {
		return doors;
	}


	public void setDoors(int doors) {
		this.doors = doors;
	}


	/**
	 * @param wheels
	 * @param doors
	 */
	// Constructor
	public Car(int wheels, int doors) {
		super();
		this.wheels = wheels;
		this.doors = doors;
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
