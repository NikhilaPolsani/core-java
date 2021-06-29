package com.arrays.practice;

import org.junit.Test;

public class ArraysPractice {

	public void declareArray() {
		int[] intArray = new int[10];
	}

	public void initializeArray() {
		int[] intArray = { 1, 2, 3, 4, 5 };
		int[] intArray2 = new int[5];
		intArray2[0] = 6;
		intArray2[1] = 7;
		intArray2[2] = 8;
		intArray2[3] = 9;
		intArray2[4] = 10;
	}

	@Test
	public void arrayLength() {
		int[] array = new int[10];
		System.out.println(array.length);
	}

}