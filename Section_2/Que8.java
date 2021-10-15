
import java.util.Scanner;

public class Que8 {

    

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter roll number :");
        int roll=sc.nextInt();

        System.out.println("Enter name of Student :");
        String name=sc.nextLine();

        System.out.println("Enter marks in Physics :");
        int phys=sc.nextInt();

        System.out.println("Enter marks in Chemistry :");
        int chem=sc.nextInt();

        System.out.println("Enter marks in Computer Application :");
        int comp=sc.nextInt();

        sc.close();
    
        

        System.out.println("Roll number :" +roll);

        System.out.println("Name of Student :" +name);

        System.out.println("Marks in Physics :" +phys);

        System.out.println("Marks in Chemistry :" +chem);

        System.out.println("Marks in Computer Application :" +comp);

        System.out.println("Total :" +(phys+chem+comp));

        System.out.println("Percentage :" +((phys+chem+comp) * (100/450) ));
    }
}
    

