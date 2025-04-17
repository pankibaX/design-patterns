package com.pankiba.designpatterns.creational.abstractfactory;

public class HondaTruck implements Truck {
	
    @Override
    public void assemble() {
        System.out.println("Assembling Honda truck");
    }
}