package com.dkte.q1;

import java.util.Scanner;

public class DateTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Date date = new Date(21, 6, 2025);
		date.displayDate();

		date.setDay(22);
		date.setMonth(07);
		date.setYear(2005);
		date.displayDate();

		System.out.println("Enter a date:");
		date.acceptDate(sc);
		date.displayDate();
	}

}
