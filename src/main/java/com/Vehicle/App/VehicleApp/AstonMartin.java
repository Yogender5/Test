package com.Vehicle.App.VehicleApp;


public class AstonMartin extends Car{
	@SuppressWarnings("unused")
	private String label;
	/**
	 * @param wheels
	 * @param doors
	 */
	public AstonMartin(int wheels, int doors) {
		super(wheels, doors);
		// TODO Auto-generated constructor stub
	}
	
	public void bar() {
		System.out.println("Bar of the car called from "+getClass().getName());
	}
}
