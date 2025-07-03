package com.dkte.q2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string - ");
		String og = new String();
		og = sc.nextLine();

		String rev = new String("");
		for (int i = og.length() - 1; i >= 0; i--)
			rev += og.charAt(i);

		System.out.println("Original string -> " + og);
		System.out.println("Reversed string -> " + rev);

		sc.close();
	}

}
