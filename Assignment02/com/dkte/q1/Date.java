package com.dkte.q1;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;

	// constructor
	public Date() {
		this(0, 0, 0);
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// getters
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// setters
	public void setDay(int day) {
		if (day > 31 || day < 0)
			return;
		this.day = day;
	}

	public void setMonth(int month) {
		if (month > 12 || month < 0)
			return;
		this.month = month;
	}

	public void setYear(int year) {
		if (year < 0)
			return;
		this.year = year;
	}

	public void acceptDate(Scanner sc) {
		System.out.print("Enter day: ");
		day = sc.nextInt();
		System.out.print("Enter month: ");
		month = sc.nextInt();
		System.out.print("Enter year: ");
		year = sc.nextInt();
	}

	// display
	public void displayDate() {
		System.out.println("Date: " + day + " / " + month + " / " + year);
	}
}
