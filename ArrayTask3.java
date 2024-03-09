package apna.array;

import java.util.Scanner;

public class ArrayTask3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter the size of an array ");
		int size = scan.nextInt();

		int[] number = new int[size];

		System.out.println(" Enter the elements of an array ");

		for (int i = 0; i < size; i++) {

			int currentNumber = scan.nextInt();

			for (int j = 0; j < i; j++) {

				if (number[j] == currentNumber) {
					System.out.println("Error: Duplicate number found in array so exit the program");
					scan.close();
					System.exit(1);
				}
			}
			number[i] = currentNumber;

		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < number.length; i++) {

			if (number[i] < min) {

				min = number[i];
			}

			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println(" largest number = " + max);
		System.out.println(" Smallest number = " + min);

		scan.close();
	}
}
