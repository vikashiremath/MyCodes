package com.kn.Recurssion2;

public class ArraySorting {

	public static boolean isSorted(int[] arr, int index) {

		if (index == arr.length) {
			return false;
		}

		if (arr[index] < arr[index + 1]) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 5,4,32,1 };
		System.out.println(isSorted(arr, 0));
	}
}
