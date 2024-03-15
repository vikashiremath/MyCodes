package com.kn.Sorting;

public class BubbleSorting {

	public static void bubbleSort(int[] arr, int index) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 9, 3, 1, 6, 7 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		bubbleSort(arr, 0);

	}
}
