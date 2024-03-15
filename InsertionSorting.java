package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class InsertionSorting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println(" Enter size for an Array ");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter Data for an " + (i + 1) + " Element ");
			arr[i] = scan.nextInt();
		}
		int[] crr = sortArrayElements(arr);
		System.out.println(" After Sorting ");
		for (int i : crr) {
			System.out.print(i + " ");
		}
		scan.close();
	}

	public static int[] sortArrayElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = -1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

}
