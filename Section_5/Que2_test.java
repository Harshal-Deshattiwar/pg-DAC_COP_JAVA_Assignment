
import java.util.Scanner;
public class Que2_test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		int ri = sc.nextInt();
		
		Que2_Circle c1 = new Que2_Circle(ri);
		
		Double area = c1.calArea();
		Double perimeter = c1.calPerimeter();
		
		System.out.println("Area :" + area);
		System.out.println("Perimeter :" + perimeter);
		sc.close();
	}

}
