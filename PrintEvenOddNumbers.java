package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class PrintEvenOddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter The Size of an Array ");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter Data for " + (i + 1) + " Elements ");
			arr[i] = scan.nextInt();
		}
		scan.close();

		System.out.println(" Initialization Done In Main Method ");

		PrintEvenOrOddElementsDemo printEvenOrOddElement = new PrintEvenOrOddElementsDemo();

		System.out.println(" Object Created Sucessfully ");

		printEvenOrOddElement.printEvenOrOddElements(arr);

		System.out.println(" -------------------------------------");

		printEvenOrOddElement.countEvenOrOddElements(arr);
	}
}
