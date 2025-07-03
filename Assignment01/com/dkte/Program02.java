package com.dkte;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st number: ");

		if (sc.hasNextDouble() && !sc.hasNextInt()) {
			double num1 = sc.nextDouble();
			System.out.print("Enter 2nd number: ");

			if (sc.hasNextDouble() && !sc.hasNextInt()) {
				double num2 = sc.nextDouble();
				double average = (num1 + num2) / 2;
				System.out.println("Average of the numbers is: " + average);
			} else {
				System.out.println("Entered number is not double!");
			}
		} else {
			System.out.println("Entered number is not double!");
		}

		sc.close();
	}

}
