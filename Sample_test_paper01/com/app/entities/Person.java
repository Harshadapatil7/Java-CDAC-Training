package com.app.entities;

import java.util.Scanner;

public class Person {
	String name;
	MyDate dateOfBirth;

	public Person() {
		this.dateOfBirth = new MyDate();
	}

	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.dateOfBirth = new MyDate(day, month, year);
	}

	public String getName() {
		return name;
	}

	public MyDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBirth(MyDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter date of birth:");
		dateOfBirth.acceptDate(sc);
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Date of birth: " + dateOfBirth;
	}
}
