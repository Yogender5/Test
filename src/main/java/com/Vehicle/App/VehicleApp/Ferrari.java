package com.Vehicle.App.VehicleApp;


public class Ferrari extends Car{
	private String badge;


	public Ferrari(int wheels, int doors) {
		super(wheels, doors);
	}
	

	public void foo() {
		System.out.println("Bar of the car called from "+getClass().getName());
	}
}
