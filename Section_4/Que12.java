import java.util.Scanner;

public class Que12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to check whether its armstrong:\n");
        int number=sc.nextInt();
        sc.close();

        int digit = 0;
        int cube = 0;
        int sum = 0;
        int temp=number;
        while(number>0){

            digit=number%10;

            cube=digit*digit*digit;

            sum=sum+cube;
            
            number=number/10;
        }
        if(sum==temp)
        System.out.println(temp+ " is armstrong.");
        else
        System.out.println(temp+" is not armstrong");
    }
    
}
