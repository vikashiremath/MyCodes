package com.kn.Recurssion2;

public class StringSubsequences {

	public static void printSub(String src, int index, String newString) {

		if (index == src.length()) {
			System.out.println(newString);
			return;
		}
		char currentChar = src.charAt(index);

		printSub(src, index + 1, newString + currentChar);

		printSub(src, index + 1, newString);
	}

	public static void main(String[] args) {

		String src = "abcd";
		printSub(src, 0, " ");
	}
}
