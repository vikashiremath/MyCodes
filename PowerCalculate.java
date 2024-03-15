package com.kn.recurssion;

import java.util.Scanner;

public class PowerCalculate {

	public static int calcPow(int x, int n) {

		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		int xPowNm1 = calcPow(x, n - 1);
		int xPow = x * xPowNm1;

		return xPow;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the base");
		int x = scan.nextInt();

		System.out.println("Enter the exponent");
		int y = scan.nextInt();

		int result = calcPow(x, y);
		System.out.println("Power calculated = " + result);

		scan.close();
	}
}
