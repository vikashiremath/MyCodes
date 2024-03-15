package com.kn.AdvancedQuestions;

public class VikasReplace {

	public static void repVi(String src, int index) {
		
		if(index==0) {
			System.out.print(src.charAt(index) + " ");
			return;
		}
		System.out.print(src.charAt(index)+ " ");
		repVi(src, index-1);
	}
	public static void main(String[] args) {

		String src = "vikas";

		repVi(src, src.length()-1);
	}

}
