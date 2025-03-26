package com.pankiba.designpatterns.creational.singleton;

public class EagerThreadSafeSingleton {

	private static EagerThreadSafeSingleton instance = new EagerThreadSafeSingleton();

	private EagerThreadSafeSingleton() {
	}

	public static EagerThreadSafeSingleton Instance() {
		return instance;
	}

}