package com.dkte.q1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of first array of strings: ");
		String[] arr1 = new String[sc.nextInt()];
		System.out.println("Enter strings -");
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = sc.next();

		System.out.print("Enter size of second array of strings: ");
		String[] arr2 = new String[sc.nextInt()];
		System.out.println("Enter strings -");
		for (int i = 0; i < arr2.length; i++)
			arr2[i] = sc.next();

		System.out.println("Duplicate strings ->");
		for (String s1 : arr1) {
			for (String s2 : arr2) {
				if (s1.equals(s2)) {
					System.out.println(s1);
				}
			}
		}

		sc.close();

	}

}
