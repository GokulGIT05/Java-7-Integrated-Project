package com.gk1.language.fundamentals2.variables;

public class Gk1InstanceVarTest {

	String instanceVariable = "Gokul";
	
	public static void main(String[] args) {
		
		/* Instance var Can't be access from static block directly.
		System.out.println(instanceVariable);
		 */
		
		Gk1InstanceVarTest obj = new Gk1InstanceVarTest();
		obj.instMethod(); // instance var can be accessed directly from non-static method.
	
		System.out.println("By Using Obj Reference Var: "+obj.instanceVariable);
		
	}
	
	public void instMethod() {
		System.out.println("Instance Method: "+ instanceVariable);
	}

}



