package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class MergeArrayLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println(" Enter The Size for an Array 1 ");
		int[] arr = new int[scan.nextInt()];
		System.out.println(" Enter The Size for an Array 2 ");
		int[] brr = new int[scan.nextInt()];

		// Array Initialization
		System.out.println(" Enter Data's for Array 1 ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter Data for " + (i + 1) + " Element ");
			arr[i] = scan.nextInt();
		}

		System.out.println(" ------> Enter Data's for Array 2 <-------");

		for (int i = 0; i < brr.length; i++) {
			System.out.println(" Enter Data for " + (i + 1) + " Element ");
			brr[i] = scan.nextInt();
		}

		int[] result = mergeArrayLength(arr, brr);
		System.out.println(" Merged Array Elements are given Below ");
		for (int i : result) {
			System.out.println(i + " ");
		}
		scan.close();
	}

	public static int[] mergeArrayLength(int[] arr, int[] brr) {
		int[] crr = new int[arr.length + brr.length];
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i];
		}
		int j = 0;
		for (int i = arr.length; i < crr.length; i++) {
			crr[i] = brr[j];
			j++;
		}
		return crr;
	}

}
