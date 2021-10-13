// add apakage

import java.util.Scanner;

public class Que15 {

	public static void main(String[] args) {
//		15. Write a java program to check if a given number is divisble by 3 and 5 ? 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int Num = sc.nextInt();
	
		if ((Num % 3 == 0) && (Num % 5 == 0)){
			System.out.println("Number is divisible by 3 and 5");
		}
		else System.out.println("Number is not divisible by 3 and 5");
		
		sc.close();
	}

}
