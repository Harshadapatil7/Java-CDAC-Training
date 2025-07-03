package com.app.carpooling;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DrivingCostCalculator calculator = new DrivingCostCalculator();
		calculator.accept(sc);
		System.out.println(calculator);
		calculator.estimateCost(sc);

		sc.close();
	}

}
