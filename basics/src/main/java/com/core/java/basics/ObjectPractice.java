package com.core.java.basics;

import org.junit.Test;

public class ObjectPractice {

	/*@Override
	public String toString() {
		return "ObjectPractice";
	}*/

	@Test
	public void method1() {
		Object obj = new Object();
		System.out.println(obj);
	}

	@Test
	public void method2() {
		ObjectPractice ob = new ObjectPractice();
		System.out.println(ob);
	}
}
