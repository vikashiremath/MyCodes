package com.kn.String;

import java.util.Scanner;

public class StringTask7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++) {

			arr[i] = scan.nextInt();
		}
		int totalLength = 0;

		for (int i = 0; i < arr.length; i++) {

			totalLength += arr.length;
		}
		System.out.println("Total Length of array = " + totalLength);

		scan.close();
	}

}
