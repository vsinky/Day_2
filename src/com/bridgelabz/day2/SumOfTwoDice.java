package com.bridgelabz.day2;

public class SumOfTwoDice {
	public static void main(String[] args) {
		int SIDES = 6;
		int a = 1 + (int) (Math.random() * SIDES);
		int b = 1 + (int) (Math.random() * SIDES);
		int sum = a + b;
		System.out.println("Sum of two Dices are :" + sum);
	}
}
