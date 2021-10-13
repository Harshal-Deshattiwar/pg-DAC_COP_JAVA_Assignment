
import java.util.Scanner;

public class Que3 {
//	Function print menu and and option to use 
	void system() {

		System.out.println("\n" + "****Welcome to Snack Center *********");
		System.out.println("\n" + "(Enter the serial number of item as choice)");
		System.out.println("\r" + "1. Tea (Rs. 10)");
		System.out.println("2. Green Tea (Rs. 15)");
		System.out.println("3. Samosa (Rs. 20)");
		System.out.println("4. Sandwitch (Rs. 50)");
		System.out.println("5. Generate Bill & Exit");

	}

	public static void main(String args[]) {
//		object of class
		Que3 obj = new Que3();

		Scanner sc = new Scanner(System.in);
		
//	required variable initialization
//		this variable will hold total amount per item
		int tea = 0, gTea = 0, samosa = 0, sandwich = 0;
//		this variable will hold quantity per item
//		qty1 for tea, qty2 for green tea, qty3 for samosa, qty4 for sandwich;
		int qty1 = 0, qty2 = 0, qty3 = 0, qty4 = 0;
//		this variable will hold total amount
		int total = 0;
//		when exit = 1 will loop will w exited
		int exit = 0;

		
		while (exit == 0) {
// call to system function
			obj.system();
			
			//take input of choice number
			System.out.print("Enter your choice :");
			int choice = sc.nextInt();
			
		// if Statement will execute for orders
			if (choice != 5) {
				//Switch will take choice number as input 
				switch (choice) {

				//all the case will calculate total quantity and amount of their respective items and will store in desire variables respectively 
				case 1:
					System.out.print("Enter quantity :");
					qty1 += sc.nextInt();
					tea = 10 * qty1;
					break;

				case 2:
					System.out.print("Enter quantity :");
					qty2 += sc.nextInt();
					gTea += 15 * qty2;
					break;
				case 3:
					System.out.print("Enter quantity :");
					qty3 += sc.nextInt();
					samosa += 20 * qty3;
					break;
				case 4:
					System.out.print("Enter quantity :");
					qty4 += sc.nextInt();
					sandwich += 50 * qty4;
					break;
				default:
					System.out.println("Entered a wrong value");
				}
			} 
			//else if statement to exit the while loop and from system
			//After successful execution of statement order details and amount will be printed
			else if (choice == 5) {
				System.out.println("\n");
				System.out.println("  *****BILL****");
				System.out.println("item      " + "qty" + " " + "Amount");
				
				//Calculating order of tea
				if (qty1 != 0) {
					total += tea;
					System.out.println("Tea        " + qty1 + "   " + tea);
				}
				
				//Calculating order of Green tea
				if (qty2 != 0) {
					total += gTea;
					System.out.println("Green Tea  " + qty2 + "   " + gTea);
				}
				
				//Calculating order of samosa
				if (qty3 != 0) {
					total += samosa;
					System.out.println("Samosa     " + qty3 + "   " + samosa);
				}
				
				//Calculating order of sandwich
				if (qty4 != 0) {
					total += sandwich;
					System.out.println("Sandwich   " + qty4 + "   " + sandwich);
				}
				
				System.out.println("----------------");
				
				//print total amount
				System.out.println("   Total :" + total);
//	exit whole system
				System.exit(0);
			}

		}
		sc.close();

	}

}
