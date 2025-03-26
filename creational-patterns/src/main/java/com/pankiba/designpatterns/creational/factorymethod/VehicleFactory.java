package com.pankiba.designpatterns.creational.factorymethod;

public abstract class VehicleFactory {

	public abstract Vehicle createVehicle();

	public void startBuildProcess() {
		createVehicle().buildVehicle();
	}
}
