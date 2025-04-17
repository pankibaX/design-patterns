package com.pankiba.designpatterns.creational.factory;

public class CarFactory extends VehicleFactory {
	
	@Override
	Vehicle createVehicle() {
		return new Car();
	}
}