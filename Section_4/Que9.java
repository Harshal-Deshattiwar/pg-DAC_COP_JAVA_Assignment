import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num");
		int n = scan.nextInt();
	
		for (int i=0; i<n; i++) {
            // inner loop to handle number space
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
            //  inner loop to handle number of columns
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
  
            System.out.println();
        }
    }

}

    
