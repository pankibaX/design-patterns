package com.pankiba.designpatterns.creational.factory;

public class Truck implements Vehicle {

	@Override
	public void assemble() {
		System.out.println("Assembling a truck");
	}

}
