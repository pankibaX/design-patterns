package com.pankiba.designpatterns.creational.factory.withreflection;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

	private Map productMap = new HashMap();

	public void registerVehicle(int vehicleId, Class vehicleClass) {
		productMap.put(vehicleId, vehicleClass);
	}

	public Vehicle createVehicle(int selectedVehicle) throws InstantiationException, IllegalAccessException {

		Class vehicleClass = (Class) productMap.get(selectedVehicle);

		return (Vehicle) vehicleClass.newInstance();

	}

}
