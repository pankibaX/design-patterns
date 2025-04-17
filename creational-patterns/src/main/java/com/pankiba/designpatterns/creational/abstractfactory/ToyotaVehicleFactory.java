package com.pankiba.designpatterns.creational.abstractfactory;

//Concrete factories
public class ToyotaVehicleFactory implements VehicleFactory {

	@Override
	public Car createCar() {
		return new ToyotaCar();
	}

	@Override
	public Truck createTruck() {
		return new ToyotaTruck();
	}
}