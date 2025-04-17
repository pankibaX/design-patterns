package com.pankiba.designpatterns.creational.abstractfactory;

public class HondaCar implements Car {
	
	@Override
	public void assemble() {
		System.out.println("Assembling Honda car");
	}
}
