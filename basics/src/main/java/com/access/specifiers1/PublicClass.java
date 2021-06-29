package com.access.specifiers1;

public class PublicClass { // outer class must be either public or default

	public int i = 10;
	private int j = 20;
	protected int k = 30;
	int a = 40; // default access modifier

	public void method1() {
		int b = 50;

	}

	private void method2() {

	}

	protected void method3() {

	}

	void method4() {

	}

	public class InnerClass1 {

	}

	private class InnerClass2 {

	}

	protected class InnerClass3 {

	}

	class InnerClass4 {

	}
}
