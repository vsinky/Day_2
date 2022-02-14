package com.bridgelabz.day2;

import java.util.Scanner;

public class DistanceProgram {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		double dis;
		System.out.println("Enter the Value of x1:");
		x1 = sc.nextInt();
		System.out.println("Enter the value of x2:");
		x2 = sc.nextInt();
		System.out.println("Enter the Value of Y1:");
		y1 = sc.nextInt();
		System.out.println("Enter the value of Y2:");
		y2 = sc.nextInt();
		System.out.println();

		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Total Distance Covered between two Points are: " + dis);
	}
}
