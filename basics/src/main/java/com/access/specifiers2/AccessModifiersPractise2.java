package com.access.specifiers2;

import com.access.specifiers1.PublicClass;

public class AccessModifiersPractise2 {

	public void method2() {
		PublicClass obj = new PublicClass();
		System.out.println(obj.i);
//		System.out.println(obj.k); // other package
//		System.out.println(obj.j);
//		System.out.println(obj.a);
	}

}
