package apna.array;

import java.util.Scanner;

public class ArrayTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter the size of an array ");
		int size = scan.nextInt();

		String[] names = new String[size];

		System.out.println(" Enter the elements of an array ");
		for (int i = 0; i < size; i++) {
			names[i] = scan.next();
		}

		System.out.println(" Printing names ");
		for (int i = 0; i < names.length; i++) {

			System.out.println(" Names " + (i + 1) + " = " + names[i]);
		}
		scan.close();

	}

}
