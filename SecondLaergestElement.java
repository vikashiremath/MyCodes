package com.kn.ArrayPracticeWeek9;

public class SecondLaergestElement {

	public static void main(String[] args) {

		int[] arr = { 21, 15, 233, 92, 56 };
		int[] crr = secondLargest(arr);
		for (int i = 0; i < crr.length; i++) {
			System.out.println(crr[i]);
		}
		System.out.println(" Second Min Value " + crr[1]);
		System.out.println(" Second max Value " + crr[crr.length - 2]);

	}

	private static int[] secondLargest(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

		}
		return arr;
	}

}
