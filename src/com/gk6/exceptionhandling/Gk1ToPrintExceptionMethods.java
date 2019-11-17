package com.gk6.exceptionhandling;

public class Gk1ToPrintExceptionMethods {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try {
			
			int i = 1/0;
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("\n*****************");
			System.out.println(e.toString()); // Only Exception and description
			System.out.println("\n*****************");
			System.out.println(e.getMessage());
			System.out.println("\n*****************");
			System.out.println(e.getCause());
		}

	}

}
