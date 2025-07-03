package com.app.entities;

import com.app.exceptions.InvalidDateException;

public class MyDate {
	int day;
	int month;
	int year;

	public MyDate() {

	}

	public MyDate(int day, int month, int year) {
		if (day <= 0 || day > 31)
			throw new InvalidDateException("Day must be between 1 to 31");
		this.day = day;

		if (month <= 0 || month > 12)
			throw new InvalidDateException("Day must be between 1 to 12");
		this.month = month;

		if (year <= 0 || year > 2025)
			throw new InvalidDateException();
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
		if (day <= 0 || day > 31)
			throw new InvalidDateException("Day must be between 1 to 31");
		this.day = day;
	}

	public void setMonth(int month) {
		if (day <= 0 || day > 31)
			throw new InvalidDateException("Day must be between 1 to 31");
		this.month = month;
	}

	public void setYear(int year) {
		if (year <= 0 || year > 2025)
			throw new InvalidDateException();
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "-" + month + "-" + year;
	}
}
