package com.Section_9;

import java.util.Scanner;

public class Que2 {
	static int limit = 0;
	static int sum = 0;
	static int num = 1;

	static void number() {
		if (num <= limit) {

			sum += num;
			num++;
			Que2.number();
		} else
			System.out.println("Sum of " +limit+ "natural number is " +sum);
		;

	}

	public static void main(String[] args) {
		System.out.println("Enter the limit : ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		limit = N;
		Que2.number();
		sc.close();

	}

}
