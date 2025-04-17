package com.pankiba.designpatterns.creational.factory;

//Concrete products
public class Car implements Vehicle {

	@Override
	public void assemble() {
		System.out.println("Assembling a car");
	}
}