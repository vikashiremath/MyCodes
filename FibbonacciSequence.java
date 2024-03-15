package com.kn.recurssion;

public class FibbonacciSequence {

	public static void printFib(int a, int b, int n) {
		
		if(n==0) {
			return;
		}
		int c = a + b;
		System.out.print(c + " ");
		
		printFib(b, c, n-1);
	}
	
	public static void main(String[] args) {
		
		int a = 0;
		System.out.print(a+" ");
		
		int b = 1;
		System.out.print(b + " ");
		
		printFib(a, b, 5);
	}
}
