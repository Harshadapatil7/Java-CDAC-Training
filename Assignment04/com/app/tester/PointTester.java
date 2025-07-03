package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class PointTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();

		p1.accept(sc);
		p2.accept(sc);

		System.out.println("Point p1: " + p1);
		System.out.println("Point p2: " + p2);

		if (p1.isEqual(p2))
			System.out.println("Both points are equal!");
		else
			System.out.println("Distance between both points is: " + p1.calculateDistance(p2));

		sc.close();
	}

}