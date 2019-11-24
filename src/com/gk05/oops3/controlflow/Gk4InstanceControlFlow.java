package com.gk05.oops3.controlflow;

public class Gk4InstanceControlFlow {

	int instanceVar1  = 10;
	
	{
		System.out.println("Inside First Instance Block");
		instanceMethod();
	}
	
	Gk4InstanceControlFlow(){
		System.out.println("Inside Constructor");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Inside Main Method: Creating an Object");
		Gk4InstanceControlFlow object = new Gk4InstanceControlFlow();
		System.out.println("End of Main Method");
	}
	
	private void instanceMethod() {
		System.out.println("Inside InstanceMethod()");
		System.out.println("The Value of instanceVar2 is: "+instanceVar2);
	}
	
	{
		System.out.println("Inside Second Instance Block");
	}

	int instanceVar2 =20;
	
}
