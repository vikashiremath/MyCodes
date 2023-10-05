package com.kn.Constructor;

public class Child extends Parent {

	//String name = " Chotu";
	//int age = 7;
	
	String name;
	int age;

	public Child() {
		super();
		System.out.println("----> Child no arg Constructor ");
		System.out.println();
	}

	public Child(String name) {
		super();
		System.out.println("---> String arg constructor ");
		this.name = name;
	}

	public Child(int age) {
		super();
		System.out.println("---> int arg Constructor ");
		this.age = age;
	}

	public Child(String name, int age) {
		super();
		System.out.println("---> 2 arg Constructor ");
		this.name = name;
		this.age = age;
	}

}
