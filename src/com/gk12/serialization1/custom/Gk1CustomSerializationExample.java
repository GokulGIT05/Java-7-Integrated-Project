package com.gk12.serialization1.custom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Gk1CustomSerializationExample {

	public static void main(String[] args) throws Exception {
		Account a1 = new Account();
		System.out.println(a1.userName + " ... " + a1.pwd);

		FileOutputStream fos = new FileOutputStream("CustSerialization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("CustSerialization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println("After De-serialization:");
		System.out.println(a2.userName + " ... " + a2.pwd);

		oos.close();
		ois.close();

	}

}

class Account implements Serializable{
	String userName = "Gokul";
	transient String pwd= "password123";
	
	// Customized de-serialization
	// Call back Methods bcoz JVM will call this.
	// Serialization
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String ePwd="123"+pwd;
		oos.writeObject(ePwd);
	}
	
	// De-Serialization
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		String ePwd = (String) ois.readObject();
		pwd =ePwd.substring(3);
	}
}