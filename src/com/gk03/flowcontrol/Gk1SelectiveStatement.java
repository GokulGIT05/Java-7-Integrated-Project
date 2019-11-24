package com.gk03.flowcontrol;

public class Gk1SelectiveStatement {

	public static void main(String[] args) {
		
		int b = 6;
		
		if(b>10); // This also valid statement
		
		int a= 1;
		
		switch(a) {
		
		case 1: 
			System.out.println("Inside Case 1");
			System.out.println("Summa");
			
		
		case 2: {
			System.out.println("Inside Case 2");
			break;
		}
		
		case 5: {
			System.out.println("Inside Case 5");
		}
		
		default:
			System.out.println("default statement");
		
		
		
		}

	}

}
