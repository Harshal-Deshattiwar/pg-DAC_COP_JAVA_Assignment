// add apakage

import java.util.Scanner;

public class Que1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first variable a : ");
		//Take first variable as input
		int a = sc.nextInt();

		System.out.println("Enter the second variable b : ");
		//Take second variable as input
		int b = sc.nextInt();
		
//		Basic operation of swapping
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("First variable 'a' : " + a);
		
		System.out.println("Second variable 'b': " + b);
		
		sc.close();
	}
	
}
