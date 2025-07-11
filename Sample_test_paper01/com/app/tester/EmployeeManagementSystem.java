package com.app.tester;

import java.util.Scanner;

import com.app.services.EmployeeServ;
import com.app.utilities.Menu;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array - ");
		EmployeeServ empServ = new EmployeeServ(sc.nextInt());

		int choice;
		while ((choice = Menu.menu(sc)) != 7) {
			switch (choice) {
			case 1:
				if (!empServ.acceptArr(sc))
					System.out.println("Can't accept more employees!!");
				break;

			case 2:
				empServ.display();
				break;

			case 3:
				System.out.print("Enter ID to search - ");
				if (!empServ.searchById(sc.nextInt()))
					System.out.println("Employee ID not found...!!!");
				break;

			case 4:
				System.out.print("Enter year - ");
				empServ.displayEmpInYear(sc.nextInt());
				break;

			case 5:
				empServ.findMaxSalary();
				break;

			case 6:
				empServ.findMinsalary();
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
