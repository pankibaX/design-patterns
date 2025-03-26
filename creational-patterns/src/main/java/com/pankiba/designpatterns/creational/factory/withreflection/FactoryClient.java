package com.pankiba.designpatterns.creational.factory.withreflection;

public class FactoryClient {

	VehicleFactory vehicleFactory = new VehicleFactory();

	public FactoryClient() {
		vehicleFactory.registerVehicle(1, Car.class);
		vehicleFactory.registerVehicle(2, MotorCycle.class);
	}

	public void buildVehicle(int selectedVehicle) throws InstantiationException, IllegalAccessException {
		// It refers to the newly created object through a common interface
		Vehicle vehicle = vehicleFactory.createVehicle(selectedVehicle);
		vehicle.buildVehicle();
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		FactoryClient factoryDemoClient = new FactoryClient();
		factoryDemoClient.buildVehicle(1);
		factoryDemoClient.buildVehicle(2);

	}

}
