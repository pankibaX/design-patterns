package com.pankiba.designpatterns.creational.abstractfactory;

public class ToyotaCar implements Car {
	
	@Override
	public void assemble() {
		System.out.println("Assembling Toyota car");
	}
}
