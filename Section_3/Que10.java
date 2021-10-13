// add apakage

import java.util.Scanner;
import java.util.Arrays;

public class Que10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[5]; //create an array
		
		//for loop to accp all the value of array
		for ( int i=0 ; i <5 ; i++) {
			System.out.println("Enter " + (i+1) + "_number");
			arr[i] = sc.nextInt();
			
		}

		Arrays.sort(arr); // sort the array ascending
		
		System.out.println(arr[0] + " is the smallest");
		
		sc.close();
	}

}
