//4. Write a program to calculate the power of any number using recursion?
//(without any  math function)

import java.util.Scanner;

public class Que4 {

	static void number(int num1, int num2, int result) {
		
		if (num2 > 0) {

			result *= num1;
			
			Que4.number(num1, num2 - 1, result);
			
		} else
			
			System.out.println("Power number  " + result);
		

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int N1 = sc.nextInt();
		
		System.out.println("Enter the power number : ");
		
		int N2 = sc.nextInt();
		
		int N3 = 1;
		
		Que4.number(N1, N2, N3);
		
		sc.close();

	}
}
