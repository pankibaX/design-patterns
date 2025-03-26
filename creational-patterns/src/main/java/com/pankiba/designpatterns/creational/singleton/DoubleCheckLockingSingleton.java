package com.pankiba.designpatterns.creational.singleton;

public class DoubleCheckLockingSingleton {

	private static DoubleCheckLockingSingleton instance = null;
	private static Object lockObj = new Object();

	private DoubleCheckLockingSingleton() {
	}

	/**
	 * After the first call to getInstance(), instance is already initialized, which avoids the synchronization hit in
	 * the most common code path. DCL also averts the race condition by checking instance a second time inside the
	 * synchronized block; that ensures that only one thread will try to initialize instance
	 */
	public static DoubleCheckLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (lockObj) {
				if (instance == null) {
					instance = new DoubleCheckLockingSingleton();
				}
			}
		}
		return instance;
	}

}