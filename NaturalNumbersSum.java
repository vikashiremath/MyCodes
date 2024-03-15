package com.kn.recurssion;

public class NaturalNumbersSum {

	public static void natNumSum(int n, int i, int sum) {
		
		if(n==i) {
			sum = sum + i;
			System.out.println(sum);
			return;
		}
		
		sum = sum+i;
		natNumSum(n, i+1, sum);
	}
	public static void main(String[] args) {
		
		int n = 5;
		natNumSum(n, 0, 0);
	}
}
