import java.util.Scanner;

public class Q7 {
    
    static Scanner sc = new Scanner(System.in);

    public static void userin(int a[]){
        for(int i = 0 ; i<a.length ; i++){
           a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        
        int a[] = new int[5];

        userin(a);

        int temp = 0 ;
        temp = a[a.length-1];
        a[a.length-1] = a[0];
        a[0] = temp;

        System.out.println(a[0] + " " + a[a.length-1]);
    }
}
