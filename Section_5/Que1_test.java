

import java.util.Scanner;
	
public class Que1_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Emp id : ");
		int empId = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Department : ");
		String dept = sc.nextLine();
		
		System.out.println("Enter Salary : ");
		int salary = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter address : ");
		String address = sc.nextLine();
		
		Que1_Emp e1 = new Que1_Emp(empId,name,dept,salary,address);
		
		e1.displayEmpDetails();
		

	}

}
