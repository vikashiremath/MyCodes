package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println(" Enter size for an Array ");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter data for an " + (i + 1) + " Elements ");
			arr[i] = scan.nextInt();
		}
		int[] brr = selectionSortArrayElements(arr);
		System.out.println(" After Sorting ");
		for (int i : brr) {
			System.out.print(i + " ");
		}

	}

	private static int[] selectionSortArrayElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			int temp = 0;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}

			// Swapping Process
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;

		}

		return arr;
	}
}
