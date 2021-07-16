package com.core.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.Test;

public class ExceptionHandlingPractice {

	@Test
	public void method1() {
		try {

		} catch (Exception e) {

		}
	}

	@Test
	public void method2() {
		try {
			InputStream is = new FileInputStream(new File("File1.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HI");
	}

	@Test
	public void method3() {
		try {
			InputStream is = new FileInputStream(new File("File1.txt"));
			System.out.println("Inside try block"); // lines after exception within a try block wont get executed
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Welcome");
		}
	}

	@Test
	public void method4() {
		try {
			//			InputStream is = new FileInputStream(new File("File1.txt"));
			System.out.println("Inside try block without catch");
		} finally {
			System.out.println("insdie finally block");
		}
	}

	@Test
	public void method5() {
		try {
			//			InputStream is = new FileInputStream(new File ("File1.txt"));
			throw new Exception("throwing exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void method6() {
		try {
			method7();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void method7() throws Exception {
		throw new Exception("throwing new exception");
	}

	private void method8() {
		throw new RuntimeException("Throwing runtime exception");
	}

	private void method9() throws CheckedException1 {
		CheckedException1 obj = new CheckedException1();
		throw obj;
	}

	private void method10() throws Exception {
		throw new CheckedException1();
	}

	@Test
	public void method11() {
		try {
			throw new CheckedException2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void method12() {
		throw new UncheckedException1();
	}
}
