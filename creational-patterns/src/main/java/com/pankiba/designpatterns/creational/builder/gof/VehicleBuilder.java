package com.pankiba.designpatterns.creational.builder.gof;

public interface VehicleBuilder {
	public void buildBody();

	void insertWheels();

	void addHeadlights();

	Car getVehicle();
}
