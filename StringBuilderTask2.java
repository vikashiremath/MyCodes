package com.kn.String;

import java.util.Scanner;

public class StringBuilderTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(" Vikas ");
		
		for(int i = 0; i<sb.length()/2; i++) {
			int front = i;
			int back = sb.length()-1-i;
			
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
			
			
		}
		scan.close();
		System.out.println(sb);
	}

}
