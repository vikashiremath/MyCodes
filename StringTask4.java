package com.kn.String;

import java.util.Scanner;

public class StringTask4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter one name");
		String name1 = scan.next();

		System.out.println("Enter another name");
		String name2 = scan.next();

		if (name1.compareTo(name2) == 0) {
			System.out.println("Both names are equal");
		} else {
			System.out.println("Both names are unequal");
		}
		scan.close();
	}

}
