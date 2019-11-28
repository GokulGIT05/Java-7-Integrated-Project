package com.gk14.generics;

public class Gk1CustomGenericClassDemo {

public static void main(String[] args) {
		// 1. String Parameter Type
		CustomGen<String> genStr= new CustomGen<String>("StringObj");
		genStr.show();
		System.out.println("get(): "+genStr.getObj().getClass().getName());
		
		// 2. Integer Parameter Type
		CustomGen<Integer> genInt = new CustomGen<Integer>(55);
		genInt.show();
		System.out.println(genInt.getObj().getClass().getName());
		
	
	}

}

class CustomGen<T> {
	
	T obj;
	
	CustomGen(T object){
		this.obj=object;
	}
	
	public void show() {
		System.out.println("The T class name is: "+obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
	}
	
}
