package com.access.specifiers2;

import com.access.specifiers1.PublicClass;

public class PublicClassImpl extends PublicClass {

	public void method3() {
		PublicClass obj = new PublicClass();
		System.out.println(obj.i);
//		System.out.println(obj.k);
		System.out.println(k); // accessible to sub class via inheritance outside the package

	}
}
