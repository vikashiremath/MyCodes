package com.kn.AdvancedQuestions;

public class StringToChar {

	public static void main(String[] args) {
		String s1 = "Vikas";
		
		char[]crr = s1.toCharArray();
		
		for(int i = 0; i<crr.length; i++) {
			
			System.out.print(crr[i]+" ");
		}
		System.out.println();
	}

}
