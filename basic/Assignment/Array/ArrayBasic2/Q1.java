import java.util.Scanner;

public class Q1{

    static Scanner sc = new Scanner(System.in);
    
    public static void userin(String a[]){
            for(int i = 0 ; i <a.length ; i++){
                a[i] = sc.next();
        }
    }

    public static void printn(String a[]){
         for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i] + " ");
         }
    }

    public static void main(String[] args) {
        
        String a[] = new String[5];
        userin(a);  
        printn(a);
    }
}