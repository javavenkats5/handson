package com.sv.core;

public class MissingNumberFinder {
	public static int findMissing(int[] intArr) {
		int last = intArr[intArr.length - 1];
		int first = intArr[0];

		int actualSum = 0, resultedSum = 0;
		for (int i = first; i < last; i++){
			actualSum += i;
		}

		for (int i = 0; i < intArr.length - 1; i++) {
			resultedSum += intArr[i];
		}

		return (actualSum - resultedSum);
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		int result = findMissing(arr);
		if (result != 0) {
			System.out.println("Missing integer in the sorted array is: " + result);
		} else
			System.out.println("No missing integers");
	}
}

