//6. Write a program to find the sum of digits of a number using recursion?

public class Que6 {

    private static int sumOfDigits(int num) {
         
        //If num zero then return  
        if(num == 0) {
            return 0;
        }

        //recursive call
        return ((num % 10) + sumOfDigits(num/10));
   }

   public static void main(String[] args) {

       //Calling sumOfDigits method
       int result = sumOfDigits(12345);
    
       //Print result
       System.out.println(result);
   }
    
}
