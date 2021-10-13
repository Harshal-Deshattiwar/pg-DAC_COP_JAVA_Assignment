// add apakage
import java.util.Scanner;
public class Que14 {

	public static void main(String[] args) {
		
//		14. Write a Java program that takes a year from user and print whether that year is a leap year or not.
//		Hint : a leap year is divisible by 4 and (not div by 100 or  if div by both 100 &400)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		if ( year % 4 == 0 ) {
			
			if (year % 100 == 0) {
				
				if (year % 400 == 0) {
					System.out.println(year +" is a leap year");
					
				}
				
			}
			
			
			
		}
		else System.out.println(year + " is not a leap year");
		
		sc.close();
		
	}

}
