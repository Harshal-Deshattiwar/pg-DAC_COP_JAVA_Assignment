// add apakage
import java.util.Scanner;
public class Que13 {

	public static void main(String[] args) {
//		13. Write a Java program to print the ASCII value of a given character?
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a charcter ");
		char Char = sc.next().charAt(0);
		int ascii = Char;
		
		System.out.println("Ascii value of " + Char + " is " + ascii);
	
	}

}
