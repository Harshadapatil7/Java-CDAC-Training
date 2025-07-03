package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("---------------------------------------------------");
		System.out.println("1. Display details of a specific point");
		System.out.println("2. Display x, y co-ordinates of all points");
		System.out.println("3. Calculate distance between two points");
		System.out.println("4. Exit");
		System.out.print("Enter your choice - ");
		choice = sc.nextInt();
		System.out.println("---------------------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of points to plot: ");
		Point2D[] points = new Point2D[sc.nextInt()];

		if (points.length > 0) {
			System.out.println();
			System.out.println("Enter x, y co-ordinates of all points -");
			for (int i = 0; i < points.length; i++) {
				System.out.println("\nFor point " + (i + 1));
				points[i] = new Point2D();
				points[i].accept(sc);
			}
			System.out.println();
			System.out.println("Points ploted successfully...!!!");
		}

		int choice;
		while ((choice = menu(sc)) != 4) {
			switch (choice) {
			case 1:
				System.out.println("Enter index: ");
				int i = sc.nextInt();
				if (i > 0 && i <= points.length && points[i - 1] != null)
					System.out.println("Point " + i + " -" + points[i - 1]);
				else
					System.out.println("There is no point at index " + i);
				break;

			case 2:
				if (points.length < 1)
					System.out.println("There are no points to display..!!!");
				else {
					System.out.println("Displaying all ploted points");
					System.out.println();
					for (i = 0; i < points.length; i++) {
						System.out.println("Point " + (i + 1) + " - " + points[i]);
					}
				}
				break;

			case 3:
				System.out.print("Enter index of start point - ");
				int start = sc.nextInt();
				if (start >= 0 && start < points.length) {
					System.out.print("Enter index of end point - ");
					int end = sc.nextInt();
					if (end >= 0 && end < points.length) {
						if (points[start].isEqual(points[end]))
							System.out.println("Both points are at same position!!");
						else
							System.out.println(
									"Distance between the points is - " + points[start].calculateDistance(points[end]));
					} else
						System.out.println("End point doesn't exist...!!");
				} else {
					System.out.println("Start point doesn't exist...!!");
				}
				break;

			default:
				System.out.println("Wrong choice.....:(");
				break;
			}
		}
		System.out.println("Exiting..........");

		sc.close();
	}

}
