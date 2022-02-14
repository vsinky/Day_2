package com.bridgelabz.day2;

import java.util.Scanner;

public class DoubleOpt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of A");
		double a = sc.nextDouble();
		System.out.println("Enter the values of B ");
		double b = sc.nextDouble();
		System.out.println("Enter the values of C ");
		double c = sc.nextDouble();

		double firstEquation = (a + b * c);
		System.out.println("(a*b+c) ==" + firstEquation);

		double secondEquation = (a * b + c);
		System.out.println("(a*b+c0 == " + secondEquation);

		double thirdEquation = (c + a / b);
		System.out.println("(c+a/b) == " + thirdEquation);

		double fourthEquation = (a % b + c);
		System.out.println("(a%b+c) == " + fourthEquation);
	}
}
