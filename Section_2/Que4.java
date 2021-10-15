import java.util.Scanner;

public class Que4 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic salary :");
        Double BasicSalary = sc.nextDouble();

        Double HRA = ((BasicSalary * 40)/100);
        Double PF = ((BasicSalary * 12)/100);

        int Medical = 1200;
        int Traveling = 800;
        int Pro_Tax = 300;

        Double HardEarn = ( BasicSalary + HRA + Medical + Traveling );
        Double Deduction = ( PF + Pro_Tax );

        System.out.println("In hand salary : " + (HardEarn - Deduction));

        sc.close();

    }
    
}
