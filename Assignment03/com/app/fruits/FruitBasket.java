package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("----------------------------------------------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display all fruits in basket");
		System.out.println("5. Display name, color, weight of fresh fruits in basket");
		System.out.println("6. Mark a fruits as stale");
		System.out.println("7. Display taste of all stale fruits");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		sc.nextLine();
		System.out.println("----------------------------------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, choice, index = 0;

		System.out.print("Enter size of basket: ");
		size = sc.nextInt();
		Fruit[] fruits = new Fruit[size];

		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if (index < fruits.length) {
					fruits[index] = new Mango();
					fruits[index].accept(sc);
					index++;
					System.out.println("Mango added to the basket ^_^");
				} else
					System.out.println("Basket is full....!!");
				break;

			case 2:
				if (index < fruits.length) {
					fruits[index] = new Orange();
					fruits[index].accept(sc);
					index++;
					System.out.println("Orange added to the basket ^_^");
				} else
					System.out.println("Basket is full....!!");
				break;

			case 3:
				if (index < fruits.length) {
					fruits[index].accept(sc);
					index++;
					System.out.println("Apple added to the basket ^_^");
				} else
					System.out.println("Basket is full....!!");
				break;

			case 4:
				System.out.println("Fruits present in basket: ");
				for (int i = 0; i < index; i++) {
					if (fruits[i] != null)
						System.out.println((i + 1) + ". " + fruits[i].getName());

				}
				break;

			case 5:
				System.out.println("Fresh fruits:");
				int count = 0;
				for (Fruit f : fruits) {
					if (f != null && f.isFresh()) {
						System.out.println();
						System.out.println(f);
						System.out.println("Taste: " + f.taste());
						System.out.println("Freshness: " + (f.isFresh() ? "Fresh" : "Stale"));
						count++;
					}
				}
				if (count <= 0) {
					System.out.println("No fresh fruits found in basket...!");
				}
				break;

			case 6:
				System.out.print("Enter index of fruits: ");
				int i = sc.nextInt();
				if (i > 0 && i <= fruits.length && fruits[i - 1] != null) {
					fruits[i - 1].setFresh(false);
					System.out.println("Successfully marked stale....!!");
				} else
					System.out.println("There is no fruit at index " + i + " !!");
				break;

			case 7:
				System.out.println("Taste of all Stale fruits: ");
				count = 0;
				for (Fruit f : fruits) {
					if (f != null && f.isFresh() == false) {
						System.out.println(f.taste());
						count++;
					}
				}
				if (count <= 0)
					System.out.println("No stale fruits found in basket...!");
				break;

			default:
				System.out.println("Wrong choice.....:(");
				break;
			}
		}
		System.out.println("Exiting.......");
		sc.close();
	}

}
