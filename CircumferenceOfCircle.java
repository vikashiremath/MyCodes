package com.kn.AdvancedQuestions;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the radius");
		double radius = scan.nextDouble();

		double circumference = 2 * 3.142 * radius;

		System.out.println("Circumference of circle = " + circumference);

		scan.close();
	}

}
