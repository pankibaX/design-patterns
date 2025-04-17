package com.pankiba.designpatterns.creational.abstractfactory;

/**
 * Abstract Factory: Like a factory-of-factories that can produce vehicles from
 * different brands (Toyota, Honda), each with their own variants
 */
public class AbstractFactoryDemo {
	public static void main(String[] args) {

		// Create Honda vehicles
		VehicleFactory brandAFactory = new HondaVehicleFactory();
		Car brandACar = brandAFactory.createCar();
		Truck brandATruck = brandAFactory.createTruck();

		brandACar.assemble();
		brandATruck.assemble();

		// Create Toyota vehicles
		VehicleFactory brandBFactory = new ToyotaVehicleFactory();
		Car brandBCar = brandBFactory.createCar();
		Truck brandBTruck = brandBFactory.createTruck();

		brandBCar.assemble();
		brandBTruck.assemble();
	}
}