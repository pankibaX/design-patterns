package com.pankiba.designpatterns.creational.factory;

/**
 * Factory Method: Like a single brand (e.g., Toyota or Honda) factory that produces
 * different types of vehicles (cars, trucks) but all from the same brand
 */

public class FactoryMethodDemo {

	public static void main(String[] args) {

		VehicleFactory carFactory = new CarFactory();
		carFactory.manufactureVehicle();

		VehicleFactory truckFactory = new TruckFactory();
		truckFactory.manufactureVehicle();
	}
}