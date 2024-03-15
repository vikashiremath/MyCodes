package com.kn.Sorting;

public class InsertionSorting {

	public static void insertSort(int[] arr, int index) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 9, 3, 1, 7, 6 };

		for (int i = 0; i < arr.length; i++) {

			int current = arr[i];

			int j = i - 1;

			while (j >= 0 && current < arr[j]) {

				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
		insertSort(arr, 0);
	}

}
