package com.kn.String;

import java.util.Scanner;

public class StringTask8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();

		String result = " ";

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'x') {
				result = result + "s";
			} else {
				result = result + name.charAt(i);
			}

		}
		System.out.println("Result = " + result);
		scan.close();
	}

}
