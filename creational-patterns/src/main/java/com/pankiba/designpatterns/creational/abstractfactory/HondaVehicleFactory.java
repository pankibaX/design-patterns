package com.pankiba.designpatterns.creational.abstractfactory;

//Concrete factories
public class HondaVehicleFactory implements VehicleFactory {

	@Override
	public Car createCar() {
		return new HondaCar();
	}

	@Override
	public Truck createTruck() {
		return new HondaTruck();
	}
}