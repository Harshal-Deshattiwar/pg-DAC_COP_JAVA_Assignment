

import java.util.Scanner;

public class Que19 {
	
	public void FindMonth(int Digit) {
		
		switch(Digit) {
		
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("february");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("octomber");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("incorrect input number not between 1 and 12");
		
		}
		
	}

	public static void main(String[] args) {
		
//		19. Write a java program to ask user to enter month number (1-12) , print month name as per below mappings - 
//		(1 - January, 2-Feburary ... 12- December)
		
		Que19 obj = new Que19(); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a number between 1 and 7 : ");
		int Num = sc.nextInt();
		
		obj.FindMonth(Num);
		
		sc.close();

	}

}
