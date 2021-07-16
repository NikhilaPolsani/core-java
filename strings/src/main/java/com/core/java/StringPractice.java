package com.core.java;

import org.junit.Test;

public class StringPractice {

	@Test
	public void declareString() {
		String s1 = "abcd";
		String s2 = new String("efgh");
		System.out.println(s1);
		System.out.println(s2);
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

	@Test
	public void reverse() {
		String s10 = "java";
//		String s11 = s10. //reverse

	}

	@Test
	public void capitalize() {
		String s12 = "java";
		String s13 = s12.substring(0, 1);
		System.out.println(s13);
		String s14 = s12.substring(1);
		System.out.println(s14);
		String s15 = s13.toUpperCase();
		System.out.println(s15);
		String s16 = s15 + s14;
		System.out.println(s16);

	}
}
