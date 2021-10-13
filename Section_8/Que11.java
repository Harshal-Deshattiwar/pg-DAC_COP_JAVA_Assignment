

public class Que11 {

	public static void main(String[] args) {

		int arr[] = { 6, 2, 7, 4, 8, 1, 9, 10, 3 };
		int hold = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					hold = arr[i];
					arr[i] = arr[j];
					arr[j] = hold;

				}

			}

		}
		for (int k =0; k < arr.length; k++) {
			
			System.out.print(arr[k] + " ,");
			
		}
	}

}
