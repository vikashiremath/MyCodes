package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class PrintArrayElementsUsingMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println(" Enter the Size of an Array ");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter Data for " + (i + 1) + " Elements ");
			arr[i] = scan.nextInt();
		}

		System.out.println(" Initialization done in Main() ");

		// Array Traversing

		int[] crr = copyArrayElements(arr);

		System.out.println(" Array Elements are as Follows ");
		for (int i = 0; i < crr.length; i++) {
			System.out.print(crr[i] + " ");
		}

	}

	private static int[] copyArrayElements(int[] arr) {
		System.out.println(" -----> copyArrayElements() Called ");
		int[] brr = new int[arr.length];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = arr[i];
		}
		return brr;
	}
}
