//package Section_1;
public class Que7 {
    public static void main(String arg[]){

        if(arg.length < 3){
            System.out.println("Error: you need to pass THREE cmd arguments");
            return;
        }

        int principle = Integer.parseInt(arg[0]);
        int rate = Integer.parseInt(arg[1]);
        int year = Integer.parseInt(arg[2]);

        System.out.println("Simple interest = " + ((principle * rate * year)/100));
    }
    
}
