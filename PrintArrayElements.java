package com.kn.ArrayPracticeWeek9;


import java.util.Scanner;

public class PrintArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration and Creation
		System.out.println(" Enter the Size of an Array ");
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		for(int i = 0; i<arr.length; i++) {
			System.out.println(" Enter Data for " + (i+1) + " Elements ");
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println(" Array Elements as Follows ");
		
		//Array Traversing
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
