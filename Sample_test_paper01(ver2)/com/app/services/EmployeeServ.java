package com.app.services;

import java.util.Scanner;

import com.app.entities.Employee;

public class EmployeeServ {
	Employee emp;
	Employee arr[];

	public EmployeeServ() {
	}

	public EmployeeServ(Employee emp) {
		this.emp = emp;
	}

	public EmployeeServ(int size) {
		arr = new Employee[size];
	}

	public void accept(Scanner sc) {
		System.out.println(
				"Enter name, date of birth(dd mm yyyy), Employee ID, department, salary, date of joining(dd mm yyyy): ");
		emp = new Employee(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next(),
				sc.nextDouble(), sc.nextInt(), sc.nextInt(), sc.nextInt());
	}

	public boolean acceptArr(Scanner sc) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				System.out.println(
						"Enter name, date of birth(dd mm yyyy), Employee ID, department, salary, date of joining(dd mm yyyy): ");
				arr[i] = new Employee(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next(),
						sc.nextDouble(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				return true;
			}
		}
		return false;
	}

	public void display() {
		boolean found = false;
		for (Employee e : arr) {
			if (e != null) {
				System.out.println(e);
				found = true;
			}
		}
		if (!found)
			System.out.println("Employees not found...!!!");
	}

	public boolean searchById(int id) {
		boolean found = false;
		for (Employee e : arr) {
			if (e != null && e.getEmpId() != 0 && id == e.getEmpId()) {
				System.out.println(e);
				found = true;
			}
		}
		return found;
	}

	public void displayEmpInYear(int year) {
		boolean found = false;
		for (Employee e : arr) {
			if (e != null && e.getDateOfJoining() != null && e.getDateOfJoining().getYear() == year) {
				System.out.println(e);
				found = true;
			}
		}
		if (!found)
			System.out.println("No employees joined in year " + year + "!!");
	}

	public void findMaxSalary() {
		int max = 0;
		boolean found = false;
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

	}

	public void findMinsalary() {
		int min = 0;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getSalary() < arr[min].getSalary()) {
				min = i;
				found = true;
			}
		}
		if (found) {
			System.out.println("Details of Employee with highest salary");
			System.out.println(arr[min]);
		} else
			System.out.println("No employee found..!!");
	}

}
