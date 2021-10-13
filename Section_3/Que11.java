// add apakage

import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		
//		Input the Roll Number of the student :784
//		Input the Name of the Student :James
//		Input the marks of Physics, Chemistry and Computer Application : 70 80 90
//
//		Expected Output :
//		Roll No : 784
//		Name of Student : James
//		Marks in Physics : 70
//		Marks in Chemistry : 80
//		Marks in Computer Application : 90
//		Total Marks = 240
//		Percentage = 80.00
//		Division = First
		
		int Total= 240;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the Roll Number of the student :");
		int Roll = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Input the Name of the Student :");
		String Name = sc.nextLine();
		
		System.out.println("Input the marks of Physics, Chemistry and Computer Application :");
		Double Phy = sc.nextDouble();
		Double Chem =sc.nextDouble();
		Double Com = sc.nextDouble();
		
Double Per = (double) (((Phy + Chem + Com) / Total ) *100 );
		
		System.out.println("Roll No :" + Roll);
		System.out.println("Name of Student : " + Name);
		System.out.println("Marks in Physics : out of 70 " + Phy);
		System.out.println("Marks in Chemistry : out of 80"+ Chem);
		System.out.println("Marks in Computer Application : out of 90 " + Com);
		System.out.println("Total Marks = " + Total);
		System.out.println("Percentage = " + Per);
		
		if (Per >= 60 && Per < 90) System.out.println("Division = First");
		else if (Per < 60 && Per >= 50 ) System.out.println("Division = Second");
		else if (Per >= 90 ) System.out.println("Division = Distinction");
		else if (Per >= 40 && Per < 50 ) System.out.println("Division = pass");
		else System.out.println("Division = fail");
		
		sc.close();
	
	}

}
