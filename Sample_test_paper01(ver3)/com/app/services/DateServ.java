package com.app.services;

import java.util.Scanner;

import com.app.entities.MyDate;

public class DateServ {
	MyDate d;

	public DateServ() {
	}

	public DateServ(MyDate d) {
		this.d = d;
	}

	public void acceptDate(Scanner sc) {
		System.out.print("Enter day, month, year - ");
		try {
			d = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
