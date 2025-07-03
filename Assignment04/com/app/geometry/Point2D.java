package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	int x;
	int y;

	// constructor
	public Point2D() {
		this(0, 0);
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getters and setters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// accept inputs
	public void accept(Scanner sc) {
		System.out.print("Enter X co-ordinate: ");
		x = sc.nextInt();
		System.out.print("Enter Y co-ordinate: ");
		y = sc.nextInt();
	}

	// check if current point equal p
	public boolean isEqual(Point2D p) {
		if (this.x == p.x && this.y == p.y)
			return true;
		return false;
	}

	// calculate distance of point p from current point
	public double calculateDistance(Point2D p) {
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
	}

	public String detDetails() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public String toString() {
		return " (x, y) = (" + x + ", " + y + ")";
	}
}