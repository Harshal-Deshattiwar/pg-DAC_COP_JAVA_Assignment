
public class Que9 {

	public static void main(String[] args) {

		int arr1[] = { 1, 4, 3, 5 };
		int arr2[] = { 6, 7, 8, 9, 10, 3 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					System.out.println("Found at position in arr1 at " + (i + 1) + " and in arr2 at " + (j + 1));
					System.exit(0);
				}

			}
		}

		System.out.println("Not found");

	}

}
