package com.kn.Patterns;

public class InvertedHalfPyramid {

	public static void main(String[] args) {

		int n = 4;
		int m = 4;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {

				if (i + j<= 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
