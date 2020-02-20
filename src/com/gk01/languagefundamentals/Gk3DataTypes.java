package com.gk01.languagefundamentals;

import javax.sound.sampled.AudioFileFormat.Type;

public class Gk3DataTypes {

	public static void main(String[] args) {

		// 1. Byte
		// Range -128 to 127
		byte b1 = 10;
		System.out.println(b1);

		byte b2 = -127;
		System.out.println(b2);

		byte b3 = (byte) 130;
		System.out.println(b3);
		byte f = (byte) 10.35;
		System.out.println(f);
		// We will be getting compile time problem, if we are assigning more than the
		// range.
//		byte b3 = -129;
//		System.out.println(b3);

		/*
		 * 1. Byte range is - 128 to 127.1 Byte ( 8 bits) 2. We cant assign more value
		 * to byte Type We will be getting compile time problem saying can't convert int
		 * to byte. 3. To resolve compile time problem, we have to do type cast. In that
		 * possible loss of precision will occur. In general we will get irregular
		 * output. 4. We can even assing double/float to byte, But have to do type cast
		 */
		// ***************************************************************

		// 2. Short
		// Rarely used.
		short s = (short) 2147483;
		System.out.println(s);

		// 3. int type

		// int i1 = 2147483649;

		// char ( 0 to 65535).
		char c = 98;
		System.out.println(c);

		int i1 = 'G';
		System.out.println(i1);
		
		// character contant to int is possible.
		
		char ch = (Character) null;
		System.out.println(ch);
		
		float f1 = 10l;
		System.out.println(f1);
		
		
	}
}
