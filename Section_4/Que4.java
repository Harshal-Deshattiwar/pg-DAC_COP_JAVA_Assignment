//4. Write a program to calculate the factorial of the given number?


import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   System.out.println("enter number ");
		   int n = scan.nextInt();
		   int factorial = 1;
		  for(int i=1;i<=n;i++) {
			  factorial *=i;
		  }
		  System.out.println("Factorial of given number is " +  factorial );
		  scan.close();
	}

}
