package com.gk12.serialization2.inhertiance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Gk2SerializationInInheritanceExample2 {

	// Child to Parent. but this also works fine. But it has different way of
	// execution refer document.
	public static void main(String[] args) throws Exception {

		ChildClass child = new ChildClass();
		child.i = 100;
		child.j = 200;

		FileOutputStream fos = new FileOutputStream("InhericanceChildSer.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(child);

		System.out.println("De-serialization Started");

		FileInputStream fis = new FileInputStream("InhericanceChildSer.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ChildClass child1 = (ChildClass) ois.readObject();
		System.out.println(child1.i + " ... " + child.j);

		oos.close();
		ois.close();
	}
}

class ParentClass {
	int i = 10;

	public ParentClass() {
		System.out.println("Inside ParentClass Constructor");
	}
}

class ChildClass extends ParentClass implements Serializable {
	int j = 20;

	public ChildClass() {
		System.out.println("Inside ChildClass Constructor");
	}

}
