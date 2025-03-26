package com.pankiba.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = -380156833722240831L;

	private static SerializableSingleton instance = new SerializableSingleton();

	private SerializableSingleton() {
	}

	public static SerializableSingleton Instance() {
		return instance;
	}

	// This method is called immediately after an object of this class is deserialized. This method returns the
	// singleton instance.
	protected Object readResolve() {
		return Instance();
	}
}
