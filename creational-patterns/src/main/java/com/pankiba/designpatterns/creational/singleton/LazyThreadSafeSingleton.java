package com.pankiba.designpatterns.creational.singleton;

public class LazyThreadSafeSingleton {

	private static LazyThreadSafeSingleton instance = null;
	private static Object lockObj = new Object();

	public static LazyThreadSafeSingleton Instance() {
		synchronized (lockObj) {
			if (instance == null) {
				instance = new LazyThreadSafeSingleton();
			}
			return instance;
		}
	}

	private LazyThreadSafeSingleton() {
	}
}