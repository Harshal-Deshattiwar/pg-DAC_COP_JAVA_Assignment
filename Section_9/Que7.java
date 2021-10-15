//7. Write a program to find the Factorial of a number using recursion?

public class Que7 {

    public static int fact(int n){
        int temp = 1;
        if ( n > 0){
            
        temp= (n * fact(n-1));

        }
        return temp; 
        
    } 

    public static void main(String args[]) {

        int number = 1;
        System.out.println(fact(number));
        
    }
    
}
