package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;

	public Fruit() {
		isFresh = true;
	}

	public Fruit(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String taste() {
		return "no specific taste";
	}

	public void accept(Scanner sc) {
		System.out.print("Enter color: ");
		color = sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter weight: ");
		weight = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Color: " + color + "\n" + "Weight: " + weight + "\n" + "Name: " + name;
	}
}