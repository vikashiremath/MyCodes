package com.kn.AdvancedQuestions;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();

		int orgNum = number;

		int rev = 0;

		while (number > 0) {

			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		if (orgNum == rev) {

			System.out.println("The given number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
		scan.close();
	}

}
