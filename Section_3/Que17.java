// add apakage

import java.util.Scanner;

public class Que17 {

	public static void main(String[] args) {
		
//		17. Write a java program to ask user to enter a number between 1 and 7, print week day as per below mappings - 
//		 (1 - Monday, 2-Tuesday, .... 7-Sunday)

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a number between 1 and 7 : ");
		int Num = sc.nextInt();
		
		switch(Num) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednsday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("incorrect input number not between 1 and 7");
		
		}
		sc.close();

	}

}
