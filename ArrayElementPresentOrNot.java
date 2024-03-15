package com.kn.ArrayPracticeWeek9;

import java.util.Scanner;

public class ArrayElementPresentOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println(" Enter The Size for an 1st Array ");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" Enter Data for " + (i + 1) + " Element ");
			arr[i] = scan.nextInt();
		}

		// Taking an Element
		System.out.println("Element Need to be Found ");
		int ele = scan.nextInt();

		int position = isElementPresentOrNot(arr, ele);
		
		System.out.println(" The Element Present at Position " + position);

	}

	private static int isElementPresentOrNot(int[] arr, int ele) {
		boolean isfound = false;
		int position = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				isfound = true;
				position = ++i;
				break;
			}
		}
		if (isfound) {
			return position;
		} else {
			return -1;
		}
	}

}
