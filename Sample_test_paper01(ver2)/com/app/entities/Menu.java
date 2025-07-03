package com.app.entities;

import java.util.Scanner;

public class Menu {
	static int choice;

	public static int menu(Scanner sc) {
		System.out.println("------------------------------------------------");
		System.out.println("1. Add Employee");
		System.out.println("2. Display All Employees");
		System.out.println("3. Search Employee");
		System.out.println("4. Display Employees joined in given year");
		System.out.println("5. Find Employee with Maximum salary");
		System.out.println("6. Find Employee with Minimum salary");
		System.out.println("7. Exit");
		System.out.print("Enter your choice - ");
		choice = sc.nextInt();
		System.out.println("------------------------------------------------");
		return choice;
	}

}
