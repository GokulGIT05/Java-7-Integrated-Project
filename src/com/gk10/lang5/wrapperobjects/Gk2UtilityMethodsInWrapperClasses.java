package com.gk10.lang5.wrapperobjects;

public class Gk2UtilityMethodsInWrapperClasses {

	public static void main(String[] args) {

		// 1.  public static Integer valueOf(int i)
		// This behavior of valueOf is same as constructors.
		// Converting Primitives into wrapper Objects.
		System.out.println("");
		Integer i1 = Integer.valueOf(2);
		System.out.println(i1);
		Integer i2 = Integer.valueOf("4");
		System.out.println(i2);
		Character c1 = Character.valueOf('C'); // This is not string arguments. Only Primitive method is available in
												// Character class.
		System.out.println(c1);
		System.out.println("***************************");
		
		// 2. public int intValue() 
		// xxxValue().
		// Converting wrapper objects into primitives.
		int value1 = i1.intValue();
		System.out.println(value1);
		
		double doubVal = i1.doubleValue();
		System.out.println(doubVal);
		
		long lValue = i1.longValue();
		System.out.println(lValue);
		
		char c2 = c1.charValue();
		System.out.println(c2);
		
		System.out.println("***************************");
		
		// 3. parseXXX
		// Converting String Objects into primitive.
		String intStr = "10";
		String booleanStr = "true";
		String floatStr = "10.123";
		String doubleStr = "10.0";
		
		int intValStr = Integer.parseInt(intStr);
		System.out.println(intValStr);
		
		boolean booleanValStr = Boolean.parseBoolean(booleanStr);
		System.out.println(booleanValStr);
		
		float floatValStr = Float.parseFloat(floatStr);
		System.out.println(floatValStr);
		
		double doubleValStr = Double.parseDouble(doubleStr);
		System.out.println(doubleValStr);
		
		// parseXXX is not possible in character class.
		
		
	}

}
