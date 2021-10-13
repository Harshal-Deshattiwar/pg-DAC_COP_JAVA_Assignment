// add apakage

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		if (num < 0) System.out.println("-1");
		
		else if (num > 0) System.out.println("1");
		
		else System.out.println("0");
		
		sc.close();
	}

}
