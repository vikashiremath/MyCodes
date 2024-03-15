package com.kn.Abstraction;

abstract class Animal {
	abstract void walk();

	Animal() {
		System.out.println(" You are creating a new Animal ");
	}

	public void eat() {
		System.out.println(" Every animal eats well ");
	}
}

class Horse extends Animal {

	Horse() {
		System.out.println(" You are creating a new horse ");
	}

	public void walk() {
		System.out.println(" Horse walks on 4 legs ");
	}

}

class Human extends Animal {

	public void walk() {
		System.out.println(" Human walks on 2 legs ");
	}
}

public class AbstarctionDemo {

	public static void main(String[] args) {

		Horse h1 = new Horse();
		h1.walk();
		h1.eat();

		Human h2 = new Human();
		h2.walk();
		h2.eat();
	}

}
