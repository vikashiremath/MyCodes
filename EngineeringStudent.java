package com.kn.Constructor;

public class EngineeringStudent extends Student {

	String branch;
	int sem;

	public EngineeringStudent(String name, int age, String branch, int sem) {
		super(name, age);
		System.out.println(" 4arg Constructor");
		this.branch = branch;
		this.sem = sem;
	}

	public EngineeringStudent(String name, int age, int sem) {
		super(name, age);
		System.out.println("name age sem arg Constructor");
		this.sem = sem;
	}

	public EngineeringStudent(String name, int age, String branch) {
		super(name, age);
		System.out.println(" name age branch arg Constructor");
		this.branch = branch;
	}

}
