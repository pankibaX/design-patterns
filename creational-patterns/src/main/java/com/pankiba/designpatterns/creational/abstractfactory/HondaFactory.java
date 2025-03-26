package com.pankiba.designpatterns.creational.abstractfactory;

public class HondaFactory extends VehicleFactory {

	@Override
	public Car createCar() {
		return new HondaCar();
	}

	@Override
	public MotorCycle createMotorcycle() {
		return new HondaMotorCycle();
	}

}
