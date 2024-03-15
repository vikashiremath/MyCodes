package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class PrintArrayEvenOrOdd {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println(" Enter The Size of an Array ");
		int[] arr = new int[Scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter Data for " + (i + 1) + " Elements ");
			arr[i] = Scan.nextInt();
		}
		Scan.close();

		System.out.println(" Initialization Done in Main() ");

		evenOrOddCheck(arr);
	}

	private static void evenOrOddCheck(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " Is Even ");
			} else {
				System.out.println(arr[i] + " Is Odd ");
			}
		}

	}

}
