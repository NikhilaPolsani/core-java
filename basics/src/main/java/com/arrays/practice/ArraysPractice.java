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

	@Test
	public void stringArray() {
		String[] array = new String[10];
		ArraysPractice[] array2 = new ArraysPractice[10];

	}

	@Test
	public void iterateArray() {
		int[] intArray3 = { 1, 2, 3, 4, 5, 6, 7 }; // access elements using index
		for (int i = 0; i < intArray3.length; i++) {
			System.out.println(intArray3[i]);
		}

		for (int i : intArray3) { // access elements directly
			System.out.println(i);

		}

		int i = 0;
		while (i < intArray3.length) {
			System.out.println(intArray3[i]);
			i++;
		}

		int j = 0;
		do {
			System.out.println(intArray3[j]);
			j++;
		} while (j < intArray3.length);
	}

}