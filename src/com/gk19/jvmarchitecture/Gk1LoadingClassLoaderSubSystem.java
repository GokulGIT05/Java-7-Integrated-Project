package com.gk19.jvmarchitecture;

import java.lang.reflect.Method;

public class Gk1LoadingClassLoaderSubSystem {

	public static void main(String[] args) throws ClassNotFoundException {
		
		int totalMethods = 0;
		Student s =new Student();
		Class theClass = Class.forName("com.gk19.jvmarchitecture.Student");
//		Class theClass = Class.forName("java.lang.Object");
		Method[] methods = theClass.getMethods();

		for (Method m : methods) {
			totalMethods++;
			System.out.println(m.getName());
		}
		System.out.println("The Total Methods are: "+totalMethods);
		
		System.out.println("**********************************");
		
		// For Every Object only one Class class Objects will be created.
		Student s1 =new Student();
		Class theClass1 = s1.getClass();
		
		Student s2 =new Student();
		Class theClass2 = s2.getClass();
		
		System.out.println(theClass1.hashCode());
		System.out.println(theClass2.hashCode());
		System.out.println( theClass1 == theClass2);
	}

	}



class Student {
	
	public String getName() {
		return "Gokul";
	}
	
	public int getRollNo() {
		return 77;
	}
}