package com.kn.String;

import java.util.Scanner;

public class StringTask9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your email");
		String email = scan.next();

		String result = " ";

		for (int i = 0; i < email.length(); i++) {

			if (email.charAt(i) == '@') {
				break;
			} else {
				result = result + email.charAt(i);
			}
		}
		System.out.println("Result = " + result);

		scan.close();
	}

}
