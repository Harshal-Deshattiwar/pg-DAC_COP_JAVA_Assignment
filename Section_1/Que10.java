//package Section_1;
public class Que10 {

    public static void main(String args[]){

        //To send a messege if the user has given no input
        if(args.length < 1){
            System.out.println("Error: you need to pass one two arguments");
            return;
        }

        Double Num1 = Double.parseDouble(args[0]); //Conver first  argument from string to double
        Double Num2 = Double.parseDouble(args[1]); //Conver Second  argument from string to double

        System.out.println("Sum = " + ( Num1 + Num2 )); //prints addition
        System.out.println("Muntiplication = " + ( Num1 * Num2 )); //prints multiplication
        System.out.println("Subtraction = " + ( Num1 - Num2 )); //prints Subtraction
        System.out.println("Division = " + ( Num1 / Num2 )); //prints division
        System.out.println("Remainder = " + ( Num1 % Num2 )); //prints remainder
    }
    
}
