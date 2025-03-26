package com.pankiba.designpatterns.creational.singleton;

public class LazyNonThreadSafeSingleton {

	private static LazyNonThreadSafeSingleton instance = null;

	private LazyNonThreadSafeSingleton() {
	}

	public static LazyNonThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new LazyNonThreadSafeSingleton();
		}
		return instance;
	}

}