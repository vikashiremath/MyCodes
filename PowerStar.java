package com.kn.AdvancedQuestions;

import java.util.Scanner;

public class PowerStar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the exponent");
		int exp = scan.nextInt();
		System.out.println("Enter the base");
		int base = scan.nextInt();

		int result = 1;

		while (exp != 0) {

			result = result * base;
			--exp;
		}
		System.out.println("Power of number is = " + result);
		scan.close();
	}

}
