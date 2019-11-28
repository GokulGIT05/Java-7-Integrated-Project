package com.gk19.jvmarchitecture;

public class Gk2ClassLoaderMethodDemo {

	public static void main(String[] args) {
		System.out.println(String.class.getClassLoader());
		System.out.println(Student.class.getClassLoader());
		System.out.println(Gk2ClassLoaderMethodDemo.class.getClassLoader());
	}

}
