package com.gk10.lang3.stringbuffer;

public class Gk1StringBufferConstructors {

	public static void main(String[] args) {
		
		// 1. Default Constructor.
		StringBuffer stringBuffer1 = new StringBuffer();
		System.out.println(stringBuffer1.capacity()); // 16
		System.out.println(stringBuffer1);
		System.out.println("*********************************");
		
		// 2. Constructor with Initial Capacity.
		StringBuffer stringBuffer2 = new StringBuffer(10);
		System.out.println(stringBuffer2.capacity());
		System.out.println(stringBuffer2);
		System.out.println("*********************************");
		
		// 3. Constructor with literal.
		StringBuffer stringBuffer3 = new StringBuffer("12345"); // 5 +16 Capacity
		System.out.println(stringBuffer3.capacity());
		System.out.println(stringBuffer3);
		System.out.println("*********************************");
	}
}
