package com.gk12.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Gk1SerializationDemo {

	public static void main(String[] args) throws Exception {

		Dog dog = new Dog();

		// Serialization
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);

		// De-Serialization
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d = (Dog) ois.readObject();
		System.out.println("The value of i,j,k is: " + d.i + " ..... " + d.j + " ..... " + d.k + " ..... " + d.l);

		oos.close();
		ois.close();
	}
}

class Dog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // To Provide Support for Multiple JVM/Machines.a
	
	transient int i = 100;
	transient static int j = 200; // transient is no use here

	int k = 300;
	transient final int l = 400; // transient is no use here

	@Override
	public String toString() {
		return "Dog [i=" + i + ", k=" + k + ", l=" + l + "]";
	}

}