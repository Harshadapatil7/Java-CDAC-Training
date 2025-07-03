package com.dkte.q3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string to check for palindrome - ");
		String og = new String();
		og = sc.nextLine();

		String rev = new String("");
		for (int i = og.length() - 1; i >= 0; i--)
			rev += og.charAt(i);

		if (og.equals(rev))
			System.out.println(og + " is palindrome!!");
		else
			System.out.println(og + " is not palindrome!!");

		sc.close();
	}

}
