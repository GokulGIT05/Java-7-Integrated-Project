package com.gk01.languagefundamentals;

public class Gk1IdentifierTest {

	public static void main(String[] args) {
		
		System.out.println("'$' And '_' are the  only Symbols  allowed as Identifiers");
		int name$ = 10;
		int total_value = 100;
		System.out.println(name$ +" : "+total_value);
		
//		int if=10; // if cannot be used as identifier.
		
		// Class or Interface name can be used as identifier, but not recommended.
		int String =10;
		int Runnable =1000;
		System.out.println(String+" :: "+Runnable);
		
		int _$_$_ = 10;
		System.out.println(_$_$_);
		
		int Integer  = 100;
		System.out.println(Integer);
		
		// 53 Keywords can't be used as identifier
		
		int _3 = 5;
		System.out.println(_3);
		
	}

}

class Name${
	
}

class _Name{
	
}

