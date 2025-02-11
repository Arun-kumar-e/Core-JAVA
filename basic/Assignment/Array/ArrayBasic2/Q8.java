import java.util.Scanner;

public class Q8 {
    static Scanner sc = new Scanner(System.in);
    
        public static void userin(int a[]){
            for(int i = 0 ; i<a.length ; i++){
               a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        
        int a[] = new int[5];
        userin(a);

        int n = (a.length/2);

        int temp = 0;
        temp = a[0];
        a[0] = a[n];
        a[n] = temp;

        System.out.println(a[0] +" " + a [n]);
    }
}
