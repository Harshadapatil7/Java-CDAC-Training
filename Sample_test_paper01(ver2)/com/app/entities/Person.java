package com.app.entities;

public abstract class Person {
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

	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Date of birth: " + dateOfBirth;
	}
}
