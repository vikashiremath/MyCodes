package com.kn.String;

import java.util.Scanner;

public class StringTask6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for int");

		int number = scan.nextInt();

		String str = Integer.toString(number);

		System.out.println(str);

		scan.close();
	}

}
