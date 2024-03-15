package com.kn.String;

import java.util.Scanner;

public class StringBuilderTask1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the name ");
		StringBuilder sb = new StringBuilder(scan.next());

		System.out.println(sb);

		sb.delete(0, 2);

		System.out.println();

		System.out.println("After deleting we get ");
		System.out.println(sb);

		System.out.println();

		System.out.println("After inserting we get");

		sb.insert(3, "vi");
		System.out.println(sb);

		scan.close();

	}

}
