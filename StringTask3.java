package com.kn.String;

import java.util.Scanner;

public class StringTask3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = scan.nextLine();
		
		String substring = sentence.substring(0, 5);
		
		System.out.println(substring);
		
		scan.close();
	}

}
