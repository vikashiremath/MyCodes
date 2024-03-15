package com.kn.recurssion;

public class PrintingNumbers1 {

	public static void printNumb(int n) {
		
		if(n==8) {
			return;
		}
		
		System.out.println(n);
		printNumb(n+1);
	}
	public static void main(String[] args) {
		
		int n = 1;
		printNumb(n);
		
	}
}
