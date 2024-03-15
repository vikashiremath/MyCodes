package com.kn.ArrayPracticeWeek9;

public class PrintEvenOrOddElementsDemo {

	// Method To Print Even Or Odd Numbers in Given Array
	public void printEvenOrOddElements(int[] arr) {
		System.out.println(" ----> printEvenOrOddElements() called. ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is an Even Number ");
			} else {
				System.out.println(arr[i] + " is Odd ");
			}
		}
	}

	// Method To Count
	public void countEvenOrOddElements(int[] arr) {

		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Total Even elements in Array = " + evenCount);
		System.out.println(" Total ODD Elements in Array = " + oddCount);

	}
}
