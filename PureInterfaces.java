package com.kn.Abstraction;

interface Bird {
	int eyes = 2;

	void fly();
}

interface Herbivore {

}

class Parrot implements Bird, Herbivore {

	public void fly() {
		System.out.println(" Parrot will fly high ");
	}
}

public class PureInterfaces {

	public static void main(String[] args) {
		Parrot p1 = new Parrot();
		p1.fly();
	}

}
