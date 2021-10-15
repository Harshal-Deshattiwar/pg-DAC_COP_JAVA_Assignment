//package Section_1;

public class Que6 {
    public static void main(String arg[]){

        if(arg.length < 3){
            System.out.println("Error: you need to pass THREE cmd arguments");
            return;
        }

        int num1 = Integer.parseInt(arg[0]);
        int num2 = Integer.parseInt(arg[1]);
        int num3 = Integer.parseInt(arg[2]);

        System.out.println("Average of "+ num1+", " + num2+", " + num3);
        System.out.print((num1+num2+num3)/3);
    }
    
}
