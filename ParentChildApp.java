package com.kn.Constructor;

public class ParentChildApp {

	public static void main(String[] args) {

		Child c1 = new Child();
		System.out.println(" Name = " + c1.name);
		System.out.println(" Age = " + c1.age);

		Child c2 = new Child("Chintu");
		System.out.println(" Name = " + c2.name);
		System.out.println(" Age = " + c2.age);

		Child c3 = new Child(7);
		System.out.println(" Name = " + c3.name);
		System.out.println(" Age = " + c3.age);

		Child c4 = new Child(" Pinky ", 8);
		System.out.println(" Name = " + c4.name);
		System.out.println(" Age = " + c4.age);
	}

}
