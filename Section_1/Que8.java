//package Section_1;
public class Que8 {
    public static void main(String args[]){

        if(args.length < 1){
            System.out.println("Error: you need to pass one cmd arguments");
            return;
        }
        int c = Integer.parseInt(args[0]);

        System.out.println("fahrenheit = " + ((9*c/5) + 32));
    }
}
