package com.pankiba.designpatterns.creational.factory;

public class TruckFactory extends VehicleFactory {
	
	@Override
	Vehicle createVehicle() {
		return new Truck();
	}
}