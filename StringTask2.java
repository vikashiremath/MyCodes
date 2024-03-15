package com.kn.String;

import java.util.Scanner;

public class StringTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter the first name of student ");
		String fname = scan.next();
		System.out.println(" Enter the last name of student ");
		String lname = scan.next();

		String fullname = fname + " " + lname;

		System.out.println(" Fullname of a student = " + fullname);

		// getting length of string
		System.out.println("length of fullname string = " + fullname.length());

		// getting characters of String
		System.out.println("characters of string = " + fullname.charAt(0));

		scan.close();
	}

}
