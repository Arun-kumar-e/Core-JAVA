import java.util.Scanner;

public class Q6 {

    public static void userin(int a[]){
        for(int i = 0 ; i<a.length ; i++){
           a[i] = sc.next().charAt(0);
        }
    }

    public static void printn(int a[]){
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i] + " ");
         }

         System.out.println();
    }
    
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int d[] = new int[5];
        int e[] = new int[5];

        userin(a);
        userin(b);
        userin(c);
        userin(d);
        userin(e);

        printn(a);
        printn(b);
        printn(c);
        printn(d);
        printn(e);
    }
}
