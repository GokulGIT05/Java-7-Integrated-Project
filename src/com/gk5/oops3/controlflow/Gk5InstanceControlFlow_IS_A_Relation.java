package com.gk5.oops3.controlflow;

public class Gk5InstanceControlFlow_IS_A_Relation  extends ParentInstanceFlow{

int instanceVar1  = 10;
	
	{
		System.out.println("Child: Inside First Instance Block");
		instanceMethod();
	}
	
	Gk5InstanceControlFlow_IS_A_Relation(){
		System.out.println("Child: Inside Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Child: Inside Main Method: Creating an Object");
		Gk5InstanceControlFlow_IS_A_Relation object = new Gk5InstanceControlFlow_IS_A_Relation();
		object.instanceMethod();
		System.out.println("Child: End of Main Method");
	}
	
	private void instanceMethod() {
		System.out.println("Child: Inside InstanceMethod()");
		System.out.println("Child: The Value of instanceVar2 is: "+instanceVar2);
	}
	
	{
		System.out.println("Child: Inside Second Instance Block");
	}

	int instanceVar2 =20;

}

class ParentInstanceFlow{
	
int instanceVar1  = 10;
	
	{
		System.out.println("Parent: Inside First Instance Block");
		instanceMethod();
	}
	
	ParentInstanceFlow(){
		System.out.println("Parent: Inside Constructor");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Parent: Inside Main Method: Creating an Object");
		ParentInstanceFlow object = new ParentInstanceFlow();
		System.out.println("Parent: End of Main Method");
	}
	
	private void instanceMethod() {
		System.out.println("Parent: Inside InstanceMethod()");
		System.out.println("Parent: The Value of instanceVar2 is: "+instanceVar2);
	}
	
	{
		System.out.println("Parent: Inside Second Instance Block");
	}

	int instanceVar2 =20;
}
