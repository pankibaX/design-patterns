package com.pankiba.designpatterns.creational.abstractfactory;

//Abstract factory
public interface VehicleFactory {

	public Car createCar();

	public Truck createTruck();

}
