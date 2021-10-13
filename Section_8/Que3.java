
import java.util.Arrays;

public class Que3 {
	
	static void highest(int a[],int n) {
		
		System.out.println("The highest in the array is : "+a[n-1]);
		
	}
	
static void secondHighest(int a[],int n) {
		
		System.out.println("The second highest in the array is : "+a[n-2]);
		
	}

	public static void main(String[] args) {
		int arr[]= {1,4,5,2,3,};
		Arrays.sort(arr);
		
		Que3.highest(arr,arr.length);
		Que3.secondHighest(arr,arr.length);

	}

}
