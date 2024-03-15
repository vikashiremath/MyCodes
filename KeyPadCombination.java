package com.kn.Recurssion2;

public class KeyPadCombination {

	public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void printComb(String src, int index, String combination) {
		if (index == src.length()) {
			System.out.println(combination);
			return;
		}

		char currentCharacter = src.charAt(index);
		String mapping = keypad[currentCharacter - '0'];

		for (int i = 0; i < mapping.length(); i++) {
			printComb(src, index + 1, combination + mapping.charAt(i));
		}
	}

	public static void main(String[] args) {
		String src = "23";
		printComb(src, 0, " ");
	}

}
