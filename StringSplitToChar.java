package com.kn.AdvancedQuestions;

public class StringSplitToChar {

	public static void splitStr(String srr) {

		char[] crr = srr.toCharArray();

		for (int i = crr.length - 1; i >= 0; i--) {
			System.out.print(crr[i]);
		}
		System.out.print(" ");
	}

	public static void main(String[] args) {

		String src = "I learnt Java in KodNest";

		String[] srr = src.split(" ");

		for (int i = 0; i < srr.length; i++) {
			splitStr(srr[i]);
		}

	}
}
