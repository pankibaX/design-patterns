package com.pankiba.designpatterns.creational.abstractfactory;

public class VehicleFactoryPicker {

	public static VehicleFactory getFactory(int brand) {

		if (brand == 1) {
			return new HondaFactory();
		} else if (brand == 2) {
			return new ToyotaFactory();
		} else {
			// return new factories
		}
		return null;
	}
}
