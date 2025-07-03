package com.app.tester;

import java.util.Scanner;

import com.app.entities.Employee;

public class EmployeeManagementSystem {

	public static int menu(Scanner sc) {
		int choice;
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee[] arr = new Employee[20];

		int choice, counter = 0;
		boolean found;
		while ((choice = menu(sc)) != 7) {
			switch (choice) {
			case 1:
				if (counter < 0 && counter > arr.length) {
					System.out.println("Error");
				} else {
					arr[counter] = new Employee();
					arr[counter].accept(sc);
					counter++;
					System.out.println("Employee added successfully..!!");
				}
				break;

			case 2:
				found = false;
				for (Employee e : arr) {
					if (e != null) {
						System.out.println(e);
						found = true;
					}
				}
				if (!found)
					System.out.println("Employees not found...!!!");
				break;

			case 3:
				System.out.print("Enter ID to search - ");
				int id = sc.nextInt();
				found = false;
				for (Employee e : arr) {
					if (e != null && e.getEmpId() != 0 && id == e.getEmpId()) {
						System.out.println(e);
						found = true;
					}
				}
				if (!found)
					System.out.println("Employee ID not found...!!!");
				break;

			case 4:
				System.out.print("Enter year - ");
				int year = sc.nextInt();
				found = false;
				for (Employee e : arr) {
					if (e != null && e.getDateOfJoining() != null && e.getDateOfJoining().getYear() == year) {
						System.out.println(e);
						found = true;
					}
				}
				if (!found)
					System.out.println("No employees joined in year " + year + "!!");
				break;

			case 5:
				int max = 0;
				found = false;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null && arr[i].getSalary() > arr[max].getSalary()) {
						max = i;
						found = true;
					}
				}
				if (found) {
					System.out.println("Details of Employee with highest salary");
					System.out.println(arr[max]);
				} else
					System.out.println("No employee found..!!");

				break;

			case 6:
				int min = 0;
				found = false;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null && arr[i].getSalary() < arr[min].getSalary()) {
						max = i;
						found = true;
					}
				}
				if (found) {
					System.out.println("Details of Employee with highest salary");
					System.out.println(arr[min]);
				} else
					System.out.println("No employee found..!!");
				break;

			default:
				System.out.println("Wrong choice..:(");
				break;
			}

		}
		System.out.println("Exiting......");

		sc.close();
	}

}
