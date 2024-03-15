package com.kn.Recurssion2;

public class RemoveDuplicates {

	public static boolean[] map = new boolean[26];

	public static void removeDuplicate(String src, int index, String newString) {

		if (index == src.length()) {
			System.out.println(newString);
			return;
		}

		char currentCharacter = src.charAt(index);
		if (map[currentCharacter - 'a']) {
			removeDuplicate(src, index + 1, newString);
		} else {
			newString += currentCharacter;
			map[currentCharacter - 'a'] = true;
			removeDuplicate(src, index + 1, newString);
		}
	}

	public static void main(String[] args) {
		String src = "abcda";
		removeDuplicate(src, 0, " ");

	}

}
