package com.pankiba.designpatterns.creational.factory.withswitchcase;

public class FactoryClient {

	VehicleFactory vehicleFactory = new VehicleFactory();

	public void buildVehicle(int selectedVehicle) {
		Vehicle vehicle = vehicleFactory.createVehicle(selectedVehicle);
		vehicle.buildVehicle();
	}

	public static void main(String[] args) {

		FactoryClient factoryDemoClient = new FactoryClient();
		factoryDemoClient.buildVehicle(1);
		factoryDemoClient.buildVehicle(2);

	}

}
