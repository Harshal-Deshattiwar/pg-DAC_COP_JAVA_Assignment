

public class Que5 {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 2, 3 };
		int arr2[] = { 6, 7 };
		int arr3[] = new int[arr.length + arr2.length];

		for (int i = 0; i < arr.length; i++) {

			arr3[i] = arr[i];

		}
//		
//		to calculate total members in arr3
		int arr3Length = (arr3.length - arr2.length);

//		Appends elements of arr2 to arr3 
		for (int k = 0; k < arr2.length; k++) {

			arr3[arr3Length] = arr2[k];
			arr3Length++;

		}

		for (int j = 0; j < arr3.length; j++) {

			System.out.print(arr3[j] + ", ");

		}

	}

}
