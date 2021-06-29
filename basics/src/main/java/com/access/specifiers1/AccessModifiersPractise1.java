package com.access.specifiers1;

public class AccessModifiersPractise1 {

	public void method1() {
		PublicClass obj = new PublicClass();
		System.out.println(obj.i);
//		System.out.println(obj.j); //j is private
		System.out.println(obj.k);
		System.out.println(obj.a);
	}
}
