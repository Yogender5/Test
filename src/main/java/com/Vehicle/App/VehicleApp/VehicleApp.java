package com.Vehicle.App.VehicleApp;

import java.util.Scanner;

public class VehicleApp {

	public static void main(String[] args) {

		String vehicleSelection;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Do you want to drive car or truck");
		vehicleSelection = scanner.next();
		if (vehicleSelection.equalsIgnoreCase("car")) {
			System.out.println("Do you want to test drive AstonMartin or Ferrari");
			if (scanner.next().equalsIgnoreCase("Ferrari")) {
				Ferrari car = new Ferrari(4, 2);
				car.drive();
				car.steer(0);
				car.stop();
				car.foo();
			} else {
				AstonMartin car = new AstonMartin(4, 4);
				car.drive();
				car.steer(0);
				car.stop();
				car.bar();
			}
		}

		if (vehicleSelection.equalsIgnoreCase("truck")) {
			System.out.println("Do you want to test drive Scania or Man");
			if (scanner.next().equalsIgnoreCase("Man")) {
				Truck truck = new Man();
				truck.drive();
				truck.steer(0);
				truck.stop();
			} else {
				Truck truck = new Scania();
				truck.drive();
				truck.steer(0);
				truck.stop();
				scanner.close();
			}
		}
	}
}
