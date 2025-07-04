package com.app.entities;

import java.util.Scanner;

public class MyDate {
	int day;
	int month;
	int year;

	public MyDate() {

	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void acceptDate(Scanner sc) {
		System.out.print("Enter day - ");
		day = sc.nextInt();
		System.out.print("Enter month - ");
		month = sc.nextInt();
		System.out.print("Enter year - ");
		year = sc.nextInt();
		sc.nextLine();
	}

	@Override
	public String toString() {
		return day + "-" + month + "-" + year;
	}
}
