package com.gk12.serialization3.externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Gk1ExternalizationDemo {

	public static void main(String[] args) throws Exception {

		ExternalizationDemo demo1 = new ExternalizationDemo("Gokul", 25, 95);

		FileOutputStream fos = new FileOutputStream("ExternalizationDemo.external");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(demo1);

		FileInputStream fis = new FileInputStream("ExternalizationDemo.external");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo demo2 = (ExternalizationDemo) ois.readObject();

		System.out.println(
				"Name is: " + demo2.s + ". The weight is " + demo2.j + ". The non-serialized value of i: " + demo2.i);

	}
}


class ExternalizationDemo implements Externalizable {
	
	/*transient*/ String s;
	int i;
	int j;
	
	public ExternalizationDemo() {
		System.out.println("Default no-arg Constructor");
	}
	public ExternalizationDemo(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(j);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s= (String) in.readObject();
		j = in.readInt();
	}

}
