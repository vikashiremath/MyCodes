package com.kn.AdvancedQuestions;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scan.nextInt();

		int orgNum = number;

		int sum = 0;

		while (number > 0) {

			sum = sum + (number % 10) * (number % 10) * (number % 10);
			number = number / 10;
		}

		if (orgNum == sum) {
			System.out.println("The given number is Armstrong Number");
		} else {
			System.out.println("The number is not Armstrong");
		}
		scan.close();
	}
}
