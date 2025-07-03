package com.dkte.q2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string - ");
		String s = new String();
		s = sc.nextLine();

		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		System.out.println("Original string -> " + s);
		System.out.println("Reversed string -> " + sb);

		sc.close();
	}

}
