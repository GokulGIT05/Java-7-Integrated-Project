package com.gk05.oops5.DiffwaysToCreateObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;

public class DifferentWaysToCreateObjectMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 1. By Using new Operator.
		SimpleTestClass obj1 = new SimpleTestClass();
		obj1.testMethod("By Using new Operator.");
		System.out.println("**********************************************************");

		// 2. By Using newInstance() Method.
		// Note: We need to give fully Qulified Class Name.
		try {
			SimpleTestClass obj2 = (SimpleTestClass) Class.forName("dp1.creational.WaysToCreateObject.SimpleTestClass")
					.newInstance();
			obj2.testMethod("By Using newInstance() Method present in Class class");

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("**********************************************************");

		// 3. By using Factory Method of the class. Its like Singleton Design Pattern.
		System.out.println("By using Factory Method of the class. Its like Singleton Design Pattern");
		Runtime runTimeObj = Runtime.getRuntime();
		DateFormat dh = DateFormat.getDateInstance();
		System.out.println(runTimeObj);
		System.out.println(dh);
		System.out.println("**********************************************************");

		// 4. By Using Clone Method.
		SimpleTestClass cloneTest = new SimpleTestClass();
		try {
			SimpleTestClass clonedObj = (SimpleTestClass) cloneTest.clone();
			clonedObj.testMethod("By Using Clone Method.");

			System.out.println("Equlity Check: ");
			System.out.println("Main Object: " + cloneTest);
			System.out.println("Clone Object: " + clonedObj); // Its a new Object

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("**********************************************************");

		// 5. By Using Deserialization
		SimpleTestClass serializationDemo = new SimpleTestClass();
		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(serializationDemo);

			// De-Serialization
			FileInputStream fis;
			fis = new FileInputStream("abc.ser");

			ObjectInputStream ois = new ObjectInputStream(fis);
			SimpleTestClass deserializedObject = (SimpleTestClass) ois.readObject();
			deserializedObject.testMethod("Using Serialization");
			System.out.println("Equality Check");
			System.out.println("Serialized Object: " + serializationDemo);
			System.out.println("De-Serialized Object: "+ deserializedObject);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
