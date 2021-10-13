// add apakage

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first variable a : ");
		//Take first variable as input
		int a = sc.nextInt();

		System.out.println("Enter the second variable b : ");
		//Take second variable as input
		int b = sc.nextInt();

		int temp = a;//Declare a variable temp and assign it vale of a
		//Assign a value to b
		a = b;
//		assign temp value to b ie value of a
		b = temp;

//		Print both swap varuiable
		System.out.println("First variable a : " + a);
		System.out.println("Second variable b : " + b);
		
		sc.close();

	}

}
