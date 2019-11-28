package com.gk12.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Gk2MultipleObjectsSerializationDemo {

public static void main(String[] args) throws Exception {
		
		Dog d1= new Dog();
		Cat c1=new Cat();
		Rat r1=new Rat();
		
		// serialization
		FileOutputStream fos =new FileOutputStream("abcMultiple.ser"); 
		// FileOutputStream automatically creates the file if its not present.
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);

		
		// De-serialization
		FileInputStream fis=new FileInputStream("abcMultiple.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		/*Dog d2=(Dog) ois.readObject();
		System.out.println(d2);*/
				// or : if we dont know order of serialization then,
		Object obj = ois.readObject();
		if (obj instanceof Dog) {
			Dog d2 = (Dog) obj;
			System.out.println("Option 2");
			System.out.println(d2);
		}
		Cat c2=(Cat) ois.readObject();
		Rat r2=(Rat) ois.readObject();	
		
		
		System.out.println(c2);
		System.out.println(r2);
		
		oos.close();
		ois.close();
		
	}

}

class Cat implements Serializable {
	int i=20;
	int j=30;
	
	
	@Override
	public String toString() {
		return "Cat [i=" + i + ", j=" + j + "]";
	}
	
}

class Rat implements Serializable {
	int i=200;
	int j=30;
	
	@Override
	public String toString() {
		return "Rat [i=" + i + ", j=" + j + "]";
	}
	
	
}
