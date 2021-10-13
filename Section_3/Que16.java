// add apakage

import java.util.Scanner;

public class Que16 {

	public static void main(String[] args) {
		
//		16. Write a java program to ask user to enter test marks of three subjects such as Phy, Chem, Math. Max marks for each subject is 100. Now calculate average of marks. Display following message based on average marks calculated - 
//
//		avg < 30 : You are failed.
//		avg >= 30 but < 60 : You passed with Second division
//		avg >=60 but < 80 : You passed wirh Fiear division
//		avg>=80 : You passed with First class distinction
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Physics marks : ");
		int Phy = sc.nextInt();
		
		System.out.println("Enter the Chemestry marks : ");
		int Chem = sc.nextInt();
		System.out.println("Enter the Maths marks : ");
		int Math = sc.nextInt();
		
		if (Phy <= 100 && Chem <= 100 && Math <= 100 ) {
			
			int avg = ((Phy + Chem + Math)/3);
			
			if (avg < 30) System.out.println("You are failed.");
			else if (avg >= 30 && avg < 60) System.out.println("You passed with Second division");
			else if (avg >=60 && avg< 80) System.out.println("ou passed wirh First division");
			else if (avg >= 80) System.out.println("You passed with First class distinction");
			
		}
		else System.out.println("incorrect marks entered (Max 100 marks each subjects)");
		
		sc.close();
	}

}
