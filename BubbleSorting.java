package com.kn.ArrayPracticeWeek9;

public class BubbleSorting {

	public static void main(String[] args) {
		// Array Declaration and creation and Initialization
		int[] arr = { 23, 14, 7, 16, 27 };

		// Sorting Logic
		System.out.println("Before Sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count = 1;

				}
				if (count == 0) {
					break;
				}
			}
		}

		// Array Traversing
		System.out.println();
		System.out.println("After Sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
