// add apakage

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int num = sc.nextInt();
		
		if ( num >= 18 ) System.out.println("You are eligible to vote");
		
		else System.out.println("You are not eligible to vote");
		
		sc.close();
		
	}

}
