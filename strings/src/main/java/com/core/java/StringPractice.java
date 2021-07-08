package com.core.java;

import org.junit.Test;

public class StringPractice {

	@Test
	public void declareString() {
		String s1 = "abcd";
		String s2 = new String("efgh");
	}

	@Test
	public void stringLength() {
		String s3 = "ijkl";
		int length = s3.length();
		System.out.println(length);
	}

	@Test
	public void caseChange() {
		String s4 = "mnop";
		String s5 = s4.toUpperCase();
		System.out.println(s5);
		System.out.println(s4);
		String s6 = s5.toLowerCase();
		System.out.println(s6);

	}

	@Test
	public void subString() {
		String s7 = "hi,welcometojava";
		String s8 = s7.substring(3);
		System.out.println(s8);
		String s9 = s7.substring(3, 10);
		System.out.println(s9);
	}
}
