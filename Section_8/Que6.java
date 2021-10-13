

public class Que6 {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 2, 3, 6, 7 };

		int toFind = 9;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == toFind) {
				System.out.println("Found");
				System.exit(0);
			}

		}
		System.out.println("Not found");
	}

}
