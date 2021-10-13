
public class Que2 {
	
	static void reverse(int a[],int n) {
		int arr2[] = new int[n];
		int pos = n;
		for (int i=0;i<n;i++) {
		
			arr2[pos - 1] = a[i];
			--pos;	
		}
		for (int j = 0; j < n; j++ ) {
			System.out.print(arr2[j] + " ,");
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Que2.reverse(arr,arr.length);


	}

}
