//8. Write a program to get the largest element of an array using recursion?

public class Que8 {

    //save the element of array
    static int temp = 0;

    public static int greatest(int a[], int i){
        
        if (i < a.length){

            if (a[i] > temp ){
                
                temp = a[i];
                return greatest(a, i + 1);
            }
            else return temp;
        }else return temp;
        

    }

    public static void main(String[] args) {

        int arr[] = {1,7,6,4,5};

        //to how alue os position of array
         int pos=0;  


        System.out.println(greatest(arr,pos));
        

    }
}
