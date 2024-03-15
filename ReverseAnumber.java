package com.kn.AdvancedQuestions;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int orgNumb = num;
		
		int rev = 0;
		
		while(num>0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse of number is = " + rev);
	}

}
