package com.gk12.serialization1.custom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Gk2CustomSerializationExample2 {

	public static void main(String[] args) throws Exception {
		AccountExample2 a1 = new AccountExample2();
		System.out.println(a1.userName + " ... " + a1.pwd + " ... " + a1.pin);

		FileOutputStream fos = new FileOutputStream("CustSerialization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("CustSerialization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		AccountExample2 a2 = (AccountExample2) ois.readObject();
		System.out.println("After De-serialization:");
		System.out.println(a2.userName + " ... " + a2.pwd + " ... " + a2.pin);

		oos.close();
		ois.close();

	}

}

class AccountExample2 implements Serializable {
	String userName = "Gokul";
	transient String pwd = "password123";
	transient String pin = "691825";

	// Customized de-serialization
	// Call back Methods bcoz JVM will call this.
	// Serialization
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject(); // It will invoke JVm to do default Serialization.
		String ePwd = "123" + pwd;
		oos.writeObject(ePwd);

		String ePin = "ABCD" + pin;
		oos.writeObject(ePin);
	}

	// De-Serialization
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String ePwd = (String) ois.readObject();
		pwd = ePwd.substring(3);

		String ePin = (String) ois.readObject();
		pin = ePin.substring(4);
	}
}