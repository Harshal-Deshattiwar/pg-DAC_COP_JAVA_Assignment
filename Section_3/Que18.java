

import java.util.Scanner;

public class Que18 {

	public void answer(char ch){
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
		
			System.out.println("Entered character "+ch+" is  Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println("Entered character "+ch+" is Consonent");
			}
			else System.out.println("Not an alphabet");
		
	}
	
	
	public static void main(String[] args) {
//		Write a Java program to check if character entered by user is a vowel, consonant or other character?
		
		Que18 obj = new Que18(); 
		
		System.out.println("Enter a charcter");
		Scanner sc = new Scanner(System.in);
		char Char = sc.next().charAt(0);
		
		obj.answer(Char);
		
		sc.close();
		
	}

}
