package com.gk10.lang2.strings;

public class Gk3ImmutableClassDemo {

	public static void main(String[] args) {

		ImmutableClass mainObj = new ImmutableClass(10);
		ImmutableClass obj1 = mainObj.ifModifyCreateNewObject(10);

		System.out.println(mainObj == obj1);

		ImmutableClass obj2 = mainObj.ifModifyCreateNewObject(100);
		System.out.println(mainObj == obj2);

	}

}

// Final Class
final class ImmutableClass {

	// Private Instance Variable.
	private int i;

	public ImmutableClass(int i) {
		super();
		this.i = i;
	}

	public ImmutableClass ifModifyCreateNewObject(int iLocal) {
		if (iLocal == this.i) {
			return this;
		} else {
			return new ImmutableClass(iLocal);
		}
	}
}