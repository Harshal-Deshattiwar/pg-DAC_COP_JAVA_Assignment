public class Que5 {
  
	static int num1 = 1;//first two numbers of the series
	static int num2 = 1;

	static void series(int iter) {
		
		if(iter>0) {
			
		int find = num1 + num2 //store the next digit 
				;
		num1 = num2;  //second digit becomes first digit
		
		num2 = find; //find digit becomes second digit
		
		System.out.print(" " + find);
		
		Que5.series(iter-1);
		
		}
		
		else System.exit(0);
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//take input of of number of digits of Fibonacci Series.
		System.out.print("Enter the number for Fibonacci Series : ");
		int number = sc.nextInt();
		//check if number is greater than 20
		if (number > 20)
			System.out.println("Entered value is greater than or equal to 20 ");
		
		//Check for input number as 0
		else if (number == 0) System.out.println("Enter number greater than 0");
		//Check for input number as 1
		else if (number == 1) System.out.println("Fibonacci Series" +num1);
		
		else {
			//as first 2 number of Fibonacci Series is 1 and 1 so (number - 2) and iter for rest numbers
			int iter = number - 2;  
			System.out.print("Fibonacci Series : " +num1 + " " + num2);
			Que5.series(iter);
		}
		sc.close();
	}

}
