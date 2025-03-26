package com.pankiba.designpatterns.creational.abstractfactory;

public class ToyotaFactory extends VehicleFactory {

	@Override
	public Car createCar() {
		return new ToyotaCar();
	}

	@Override
	public MotorCycle createMotorcycle() {
		return new ToyotaMotorCycle();
	}

}
