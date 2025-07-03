package com.dkte;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("Given number: " + num1);

		String num = Integer.toBinaryString(num1);
		System.out.println("Binary number: " + num);

		num = Integer.toOctalString(num1);
		System.out.println("Octal number: " + num);

		num = Integer.toHexString(num1);
		System.out.println("Hexadecimal number: " + num);

		sc.close();
	}

}