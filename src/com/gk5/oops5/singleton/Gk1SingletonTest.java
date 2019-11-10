package com.gk5.oops5.singleton;

public class Gk1SingletonTest {

	public static void main(String[] args) {
		SingletonClass obj1= SingletonClass.getSingletonObject();
		SingletonClass obj2 = SingletonClass.getSingletonObject();
		
		if(obj1==obj2) {
			System.out.println("Both Objects are equal");
			System.out.println(obj1+" :::: "+obj2);
		}
	}

}

class SingletonClass{
	
	// Static Instance Modifier. Because it should call from static method
	private static SingletonClass singletonClassObj = null;
	
	//Private Constructor. To Restrict creation of an object.
	private SingletonClass() {
		super();
	}
	
	// Public Static Method, because this method should call from anywhere.
	public static SingletonClass getSingletonObject() {
		if(singletonClassObj == null) {
			singletonClassObj = new SingletonClass();
		}
		return singletonClassObj;
	}
	
}