package com.dkte;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter pattern length: ");
		int len = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= len; i++) {
			for (int k = 1; k <= (len - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}