package com.gk12.serialization2.inhertiance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Gk1SerializationInInheritanceExample {

	// Parent to Child Serialization
	public static void main(String[] args) throws Exception {
		
		Lion lion =new Lion();
		System.out.println(lion.i+" ... "+lion.j);
		
		FileOutputStream fos=new FileOutputStream("InheritanceDemo.ser");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(lion);
		
		FileInputStream fis=new FileInputStream("InheritanceDemo.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Lion lion1=(Lion) ois.readObject();
		System.out.println(lion1.i+" ... "+lion1.j);
		ois.close();
		oos.close();
	}
}

class Animal implements Serializable{
	int i =10;
}

class Lion extends Animal{
	int j=20;
}
