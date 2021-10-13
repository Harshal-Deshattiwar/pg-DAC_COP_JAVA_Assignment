
public class Que7 {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 2, 3, 6, 7 };

		int toFind = 5;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == toFind) {
				System.out.println("Found at position " + (i+1));
				System.exit(0);
			}

		}
		System.out.println("Not found");
		
	}

}
