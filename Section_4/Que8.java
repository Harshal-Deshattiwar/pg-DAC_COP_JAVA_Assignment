import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num");
		int n = scan.nextInt();
		int k=1;
		
		for (int i=1; i <= n; i++ ) {
			for(int j =1;j<=i;j++) {
				//System.out.print(j + " ");
				//System.out.print(i + " ");
				System.out.print(k++);
			}
			 System.out.println();
		}
	     scan.close();

	}

}
