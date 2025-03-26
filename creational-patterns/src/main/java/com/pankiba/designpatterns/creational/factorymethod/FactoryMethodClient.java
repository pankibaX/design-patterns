package com.pankiba.designpatterns.creational.factorymethod;

public class FactoryMethodClient {

	public void buildVehicle(VehicleFactory vehicleFactory) {
		vehicleFactory.startBuildProcess();
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		FactoryMethodClient factoryMethodClient = new FactoryMethodClient();

		factoryMethodClient.buildVehicle(new CarFactory());
		factoryMethodClient.buildVehicle(new MotorCycleFactory());

	}

}
