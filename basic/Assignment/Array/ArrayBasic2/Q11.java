import java.util.Scanner;

public class Q11 {
    
    static Scanner sc = new Scanner(System.in);

    public static void userin(int a[]){
        for(int i = 0 ; i <a.length ; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        
        int a[] = new int[6];

        userin(a);
        int firstEvenIndex = -1;
        int lastEvenIndex = -1;


        for(int i = 0 ; i< a.length ; i++){
            if(i%2 == 0){
               System.out.print("First even index is " + i);
               firstEvenIndex = i ;
               break;
            }
        }
 
        System.out.println();
 
        for(int j = a.length-1 ; j>=0 ; j-- ){
           if (j%2 == 0) {
               System.out.print("last even index is " + j);
               lastEvenIndex = j;
               break;
           }
        }

        int temp = a[firstEvenIndex];
        a[firstEvenIndex] = a[lastEvenIndex];
        a[lastEvenIndex] = temp;

        
    }
}
