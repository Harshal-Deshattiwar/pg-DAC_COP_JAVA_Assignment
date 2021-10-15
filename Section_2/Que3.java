import java.util.Scanner;
public class Que3 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle amount:");
        Double principle = sc.nextDouble();

        System.out.println("Enter interest rates:");
        Double rate = sc.nextDouble();

        System.out.println("Enter years:");
        Double year = sc.nextDouble();

        System.out.println("Simple interest = " + ((principle * rate * year)/100));

        sc.close();
    }
        
    
}
