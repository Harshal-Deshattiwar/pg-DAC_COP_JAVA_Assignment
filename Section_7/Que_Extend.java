
import java.util.Scanner;
public class Que_Extend {
	
	static void display() {
		System.out.println("***************************************************");
		System.out.println("Enter the serial number of the operation to perform");
		System.out.println("***************************************************");
		System.out.println("1. Get power");
		System.out.println("2. Get Factorial");
		System.out.println("3. Check for prime");
		System.out.println("4. Check for Even");
		System.out.println("5. Check for odd");
		System.out.println("6. to exit");
		
	}
	
	static void system(int choice) {
		Scanner sc = new Scanner(System.in);
		switch(choice) {
				
				case 1: 
				System.out.println("***************************************************");
				System.out.print("Enter the number : ");
				double num1 = sc.nextDouble();
				System.out.print("Power should be raised to :");
				int pow = sc.nextInt();
				double power=NumUtil.getPower(num1,pow);
				System.out.println("The "+num1+" raise to "+ pow+" is = "+power);
				break;
				
				case 2: 
					System.out.println("***************************************************");
					System.out.print("Enter the number to get factorial: ");
					int num2 = sc.nextInt();
					long fact=NumUtil.getFactorial(num2);
					System.out.println("The factorial of "+num2+" is = "+fact);
					break;
				
				case 3:
					System.out.println("***************************************************");
					System.out.print("Enter the number to check if prime: ");
					int num3 = sc.nextInt();
					boolean prime = NumUtil.isPrime(num3);
					if (prime == false)System.out.println(num3 +" is not a prime number");
					else System.out.println(num3 +" is a prime number");
//					System.out.println(prime);
				break;
				
				case 4 :
					System.out.println("***************************************************");
					System.out.print("Enter the number to check if even: ");
					int num4 = sc.nextInt();
					boolean even = NumUtil.isEven(num4);
					if(even == false) System.out.println(num4 +" is a not even number");
					else System.out.println(num4 +" is a even number");
				System.out.println(even);
				break;
				
				case 5:
					System.out.println("***************************************************");
					System.out.print("Enter the number to check if odd: ");
					int num5 = sc.nextInt();
					boolean odd =NumUtil.isOdd(num5);
					if (odd == false)System.out.println(num5 +" is not a odd number");
					else System.out.println(num5 +" is a odd number");
//				System.out.println(odd);
				break;
				
				case 6:
					System.out.println("*******Exited****");
					System.exit(0);
				
				default:System.out.println("Enter appropiate choice");
				
				sc.close();
				
				
				} 
		
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exit = 0;

		
		while (exit == 0) {
			Que_Extend.display();
			
			System.out.print("Enter choice : " );
			int choice = sc.nextInt();
			System.out.println("");
			Que_Extend.system(choice);
			
			sc.nextLine();
			System.out.println("Do you want to continue : (y/n) :");
			char sig = sc.nextLine().charAt(0);
			System.out.println("Exited successfully");
			if (sig == 'n' || sig == 'N' ) {
				++exit;
			}
			
			}
		
		sc.close();
	}

}
