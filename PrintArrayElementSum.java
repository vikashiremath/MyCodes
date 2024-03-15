package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class PrintArrayElementSum {

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
		scan.close();

		System.out.println(" Initialization Done in Main Method ");

		System.out.println(" Sum of Array Elements = " + sumOfArrayElements(arr));
	}

	// Method To Calculate Sum of Array Elements

	public static int sumOfArrayElements(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
