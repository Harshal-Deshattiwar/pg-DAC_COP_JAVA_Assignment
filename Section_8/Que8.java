
public class Que8 {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 5, 2, 3, 6, 7 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {

				if (i == j)
					continue;

				else if (arr[i] == arr[j]) {

					System.out.println("Found at position " + (i + 1) + " and " + (j + 1));
					System.exit(0);
				}

			}
		}

		System.out.println("Not found");
	}

}
