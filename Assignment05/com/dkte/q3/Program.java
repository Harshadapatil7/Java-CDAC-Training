package com.dkte.q3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string to check for palindrome - ");
		String og = new String();
		og = sc.nextLine();

		StringBuilder rev = new StringBuilder(og);
		rev.reverse();
		if (og.equals(rev.toString()))
			System.out.println(og + " is palindrome!!");
		else
			System.out.println(og + " is not palindrome!!");

		sc.close();
	}

}
