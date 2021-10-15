import java.util.Scanner;

public class Que2 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in); //sanner object

        //display info and can given input
        System.out.println("Enter the first number:");
        Integer num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        Integer num2 = sc.nextInt();
        
        System.out.println("Enter the third number:");
        Integer num3 = sc.nextInt();

        System.out.println("Enter the fourth number:");
        Integer num4 = sc.nextInt();

        System.out.println("Enter the fifth number:");
        Integer num5 = sc.nextInt();

        //print average
        System.out.println("Average is : " + ((num1 + num2 + num3 + num4 + num5)/5));

        sc.close(); //avoid memory leak

    }
    
}
