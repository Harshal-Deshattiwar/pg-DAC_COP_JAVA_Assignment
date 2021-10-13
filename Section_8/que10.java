

import java.util.Scanner;

public class que10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("rows : ");
		int row = sc.nextInt();
		System.out.println("columns");
		int col = sc.nextInt();
		int matrix1[][] = new int[row][col];
		int matrix2[][] = new int[row][col];
		int resultMatrix[][] = new int[row][col];

		
//		store elements of matrix 1
		System.out.println("Elements of matrix 1 : ");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				matrix1[i][j] = sc.nextInt();

			}
		}
//		store elements of matrix 2
		System.out.println("Elements of matrix 2 : ");
		for (int k = 0; k < row; k++) {

			for (int l = 0; l < col; l++) {
				matrix2[k][l] = sc.nextInt();

			}
		}

//		addition of above two matrix elements 
//		and storing it in new result matrix
		for (int m = 0; m < row; m++) {

			for (int n = 0; n < col; n++) {
				resultMatrix[m][n] = (matrix1[m][n] + matrix2[m][n]);

			}
		}

//		printing new result matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				System.out.print(resultMatrix[i][j] + "\t");

			System.out.println();
		}

	}

}
