package com.kn.recurssion;

import java.util.Scanner;

public class FactorialNumber {

	public static int printFact(int n) {

		if (n == 0 || n == 1) {

			return 1;
		}
		int factNm1 = printFact(n - 1);
		int fact = n * factNm1;

		return fact;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = scan.nextInt();

		int result = printFact(n);

		System.out.println("Factorial of given number = " + result);

		scan.close();

	}
}