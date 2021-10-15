

import java.util.Scanner; //import scanner library

public class Que_1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // create new scaner object
        System.out.println("Enter your name");
        String Name = sc.nextLine(); //take the input as a string

        System.out.println("Hello " + Name + ", Welcome to Java World."); //print the given sentence
        
        sc.close(); //close scanner to avoid resourse leak warning

    } 
}
