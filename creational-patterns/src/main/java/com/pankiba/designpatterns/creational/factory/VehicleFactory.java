package com.pankiba.designpatterns.creational.factory;

public abstract class VehicleFactory {

	// Factory method
	abstract Vehicle createVehicle();

	public void manufactureVehicle() {
		
		Vehicle vehicle = createVehicle();
		vehicle.assemble();
	}
}
