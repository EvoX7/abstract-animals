package org.abstractt.animals;

public class Sparrow extends Animal implements IVolante {

	public Sparrow(String name) {
		super(name);

	}

	@Override
	public void verse() {
		System.out.println("the sparrow: tweets");

	}

	@Override
	public void eat() {
		System.out.println("the sparrow eats: corn, oats, wheat");

	}

	@Override
	public void fly() {
		System.out.println("\nI am flying!!!");

	}

}