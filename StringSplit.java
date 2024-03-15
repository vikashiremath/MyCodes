package com.kn.AdvancedQuestions;

public class StringSplit {

	public static void main(String[] args) {

		String src = "I learnt Java in KodNest";

		String[] srr = src.split(" ");

		for (int i = srr.length - 1; i >= 0; i--) {

			System.out.print(srr[i] + " ");
		}
		System.out.println();

	}

}
