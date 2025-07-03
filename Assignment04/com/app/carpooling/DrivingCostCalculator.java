package com.app.carpooling;

import java.util.Scanner;

public class DrivingCostCalculator {
	double milesPerDay;
	double costPerGallon;
	double avgMilesPerGallon;
	double parkingFees;
	double tollsPerDay;

	public DrivingCostCalculator() {
	}

	public DrivingCostCalculator(double milesPerDay, double costPerGallon, double avgMilesPerGallon, double parkingFees,
			double tollsPerDay, int noOfPeople) {
		this.milesPerDay = milesPerDay;
		this.costPerGallon = costPerGallon;
		this.avgMilesPerGallon = avgMilesPerGallon;
		this.parkingFees = parkingFees;
		this.tollsPerDay = tollsPerDay;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter total miles driven per day - ");
		milesPerDay = sc.nextDouble();
		System.out.print("Enter cost per gallon of gasoline - ");
		costPerGallon = sc.nextDouble();
		System.out.print("Enter average milles per gallon - ");
		avgMilesPerGallon = sc.nextDouble();
		System.out.print("Enter parking fees per day - ");
		parkingFees = sc.nextDouble();
		System.out.print("Enter tolls per day - ");
		tollsPerDay = sc.nextDouble();
	}

	public double calculateTotalCost() {
		double fuelCost = (milesPerDay / avgMilesPerGallon) * costPerGallon;
		return fuelCost + parkingFees + tollsPerDay;
	}

	public double calculateCostPerPerson(int noOfPeople) {
		if (noOfPeople <= 1)
			return calculateTotalCost();
		return calculateTotalCost() / noOfPeople;
	}

	public void estimateCost(Scanner sc) {
		System.out.println();
		System.out.println("Total driving cost per day: " + calculateTotalCost());
		System.out.println("This Money can be saved by Car Sharing/Pooling.\n"
				+ "It will also reduce carbon emissions and reduce traffic congestion.");

		System.out.println();
		System.out.println("To estimsate cost by carpooling");
		System.out.print("Enter no. of car poolers - ");
		int noOfPeople = sc.nextInt();

		if (calculateCostPerPerson(noOfPeople) < calculateTotalCost()) {
			System.out.println("Cost per person by carpooling: " + calculateCostPerPerson(noOfPeople));
		} else {
			System.out.println("Consider car pooling to save more!!!");
		}
	}

	@Override
	public String toString() {
		System.out.println();
		return "Total miles driven per day - " + milesPerDay + "\n" + "Cost per gallon of gasoline - " + costPerGallon
				+ "\n" + "Average milles per gallon - " + avgMilesPerGallon + "\n" + "Parking fees per day - "
				+ parkingFees + "\n" + "Tolls per day - " + tollsPerDay;
	}
}
