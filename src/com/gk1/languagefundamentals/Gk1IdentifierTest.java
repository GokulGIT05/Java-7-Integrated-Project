package com.gk1.languagefundamentals;

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
	}

}

class Name${
	
}

class _Name{
	
}

