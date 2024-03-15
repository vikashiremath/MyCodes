package com.kn.Patterns;

public class InvertedHalfPyramidWithNumbers {

	public static void main(String[] args) {
		int n = 5;
		int m = 5;

		for (int i = 1; i <=n; i++) {

			for (int j = 1; j<=m; j++) {

				if (i + j <= 6) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
