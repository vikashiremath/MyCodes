package com.kn.String;

import java.util.Scanner;

public class StringTask5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for the string");
		String str = scan.next();

		int number = Integer.parseInt(str);

		System.out.println(number);

		scan.close();
	}

}
