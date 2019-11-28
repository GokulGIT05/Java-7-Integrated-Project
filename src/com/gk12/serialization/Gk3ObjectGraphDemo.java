package com.gk12.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Gk3ObjectGraphDemo {

public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("ObjectGraphDemo.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		DogOG dog=new DogOG();
		oos.writeObject(dog);
		
		FileInputStream fis=new FileInputStream("ObjectGraphDemo.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		DogOG dog1 = (DogOG) ois.readObject();
		System.out.println("using Object Graph Serailization");
		System.out.println(dog1.cat.rat.i);
	}

}

class DogOG implements Serializable {

	CatOG	cat=new CatOG();
}

class CatOG implements Serializable{
	RatOG rat=new RatOG();
}

class RatOG implements Serializable { // If i remove Serializable, we will get RTE.
	int i=100;
}	