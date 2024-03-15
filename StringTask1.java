package com.kn.String;

import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name of student");
		String fname = scan.next();
		System.out.println("enter the last name of student");
		String lname = scan.next();

		String fullName = fname + " " + lname;

		System.out.println("Fullname of student = " + fullName);

		scan.close();
	}

}
