package com.kn.Recurssion2;

public class MoveAllStrings {

	public static void movStr(String src, int index, int count, String newString) {
		
		if(index==src.length()) {
			System.out.println(newString);
			return;
		}
		
		char currentChar = src.charAt(index);
		
		if(currentChar=='x') {
			count++;
		}else {
			newString = newString+currentChar;
		}
		movStr(src, index+1, count, newString);
	}
	public static void main(String[] args) {
		String src = "Vxixkxaxsx";
		movStr(src, 0, 0, " ");
	}
}
