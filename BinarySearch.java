package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println(" Enter The Size Of an Array ");
		arr = new int[scan.nextInt()];

		// Array Initialization

		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter Data for an " + (i + 1) + " Element ");
			arr[i] = scan.nextInt();
		}

		// Taking an Element
		System.out.println(" Enter an Element need to be found ");
		int element = scan.nextInt();

		elementFound(arr, element);
	}

	private static void elementFound(int[] arr, int element) {

		// Array Traversing
		int position = -1;
		int low = 0;
		int high = arr.length;
		boolean isElementFound = false;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (element == arr[mid]) {
				isElementFound = true;
				position = mid + 1;
				break;

			} else if (element > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (isElementFound == false) {
			System.out.println(" Element not Found in Array ");
		} else {
			System.out.println(" Element found at " + position);
		}

	}

}
