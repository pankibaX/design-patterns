package com.pankiba.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonDemoClient {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializableSingleton instanceOne = SerializableSingleton.Instance();

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializableSingleton instanceTwo = (SerializableSingleton) in.readObject();
		in.close();

		// test by commenting readResolve method in SerializableSingleton class
		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

	}

}
