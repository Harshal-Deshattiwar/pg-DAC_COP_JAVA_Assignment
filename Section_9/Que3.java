package com.Section_9;

import java.util.Scanner;

public class Que3 {
	
	static void number(int num1 , int num2 ,int product) {
		if (num2 > 0) {

			product += num1;
			Que3.number(num1, num2 -1,product);
		} else
			System.out.println("product is "+product);
		;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int N1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int N2 = sc.nextInt();
		int N3=0;
		Que3.number(N1,N2,N3);
		sc.close();

	}


}
