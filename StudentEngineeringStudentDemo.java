package com.kn.Constructor;

public class StudentEngineeringStudentDemo {

	public static void main(String[] args) {

		EngineeringStudent e1 = new EngineeringStudent("Vikas", 21, "CSE", 8);
		System.out.println(" Name = " + e1.name);
		System.out.println(" Age = " + e1.age);
		System.out.println(" Branch = " + e1.branch);
		System.out.println(" Sem = " + e1.sem);

		System.out.println();

		EngineeringStudent e2 = new EngineeringStudent("Veeresh", 16, 3);
		System.out.println(" Name = " + e2.name);
		System.out.println(" Age = " + e2.age);
		System.out.println(" Sem = " + e2.sem);

		System.out.println();

		EngineeringStudent e3 = new EngineeringStudent("modi", 72, " BJP ");
		System.out.println(" Name = " + e3.name);
		System.out.println(" Age = " + e3.age);
		System.out.println(" Branch = " + e3.branch);

	}

}
