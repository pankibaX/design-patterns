package com.pankiba.designpatterns.creational.abstractfactory;

public class ToyotaTruck implements Truck {
	
    @Override
    public void assemble() {
        System.out.println("Assembling Toyota truck");
    }
}