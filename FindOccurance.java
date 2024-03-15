package com.kn.Recurssion2;

public class FindOccurance {

	public static int first = -1;
	public static int last = -1;

	public static void findOcc(String src, int index, char element) {

		if (index == src.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}

		char currentCharacter = src.charAt(index);

		if (currentCharacter == element) {

			if (first == -1) {
				first = index;
			} else {
				last = index;
			}
		}
		findOcc(src, index + 1, element);
	}

	public static void main(String[] args) {
		String src = "abacva";
		findOcc(src, 0, 'a');
	}
}
