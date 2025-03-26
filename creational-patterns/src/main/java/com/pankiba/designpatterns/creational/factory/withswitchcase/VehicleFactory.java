package com.pankiba.designpatterns.creational.factory.withswitchcase;

public class VehicleFactory {

	/**
	 * the object creation logic is hidden from the client. Instead of knowing the exact object class and instantiating
	 * it through a constructor, the responsibility of creating an object is moved away from the client.
	 */
	public Vehicle createVehicle(int selectedVehicle) {

		Vehicle vehicle = null;

		if (selectedVehicle == 1) {
			vehicle = new Car();
		} else if (selectedVehicle == 2) {
			vehicle = new MotorCycle();
		} else {
			// newly added vehicles
		}

		return vehicle;

	}

}
