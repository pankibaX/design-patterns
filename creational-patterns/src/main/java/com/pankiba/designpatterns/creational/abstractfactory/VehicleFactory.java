package com.pankiba.designpatterns.creational.abstractfactory;

public abstract class VehicleFactory {

	public abstract Car createCar();

	public abstract MotorCycle createMotorcycle();

	public Vehicle startBuildProcess(int vehicleId) {

		if (vehicleId == 1) {
			return createCar();
		} else {
			return createMotorcycle();
		}

	}

}
