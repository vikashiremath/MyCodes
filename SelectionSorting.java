package com.kn.Sorting;

public class SelectionSorting {

	public static void selSort(int[] arr, int index) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 7, 2, 9, 5, 8 };

		for (int i = 0; i < arr.length - 1; i++) {

			int smallest = i;

			for (int j = i; j < arr.length; j++) {

				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		selSort(arr, 0);
	}
}
