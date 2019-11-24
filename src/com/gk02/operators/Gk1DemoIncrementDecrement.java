package com.gk02.operators;

public class Gk1DemoIncrementDecrement {

	public static void main(String[] args) {
		
		int x1 =10;
		System.out.println(x1++);
		System.out.println("After line: "+x1);
		
		int x2 =10;
		System.out.println(++x2);
		System.out.println("After line: "+x2);
		
		int x3 =10;
		System.out.println(x3--);
		System.out.println("After line: "+x3);
		
		int x4=10;
		System.out.println(--x4);
		System.out.println("After line: "+x4);
		
		System.out.println("*************end of Values****************\n");
		
		int xx1 =10;
		int y1=xx1++;
		// Here itself xx1 value will be incremented
		System.out.println("Value of xx1: "+xx1+" ## value of y1: "+y1);
		System.out.println("*********************");
		
		int xx2 =20;
		int y2=++xx2;
		System.out.println("Value of xx1: "+xx2+" ## value of y1: "+y2);
		System.out.println("*********************");
		
		int xx3 =30;
		int y3=xx3--;
		System.out.println("Value of xx1: "+xx3+" ## value of y1: "+y3);
		System.out.println("*********************");
		
		int xx4=40;
		int y4=--xx4;
		System.out.println("Value of xx1: "+xx4+" ## value of y1: "+y4);
		System.out.println("*********************");
		
		
	}

}
