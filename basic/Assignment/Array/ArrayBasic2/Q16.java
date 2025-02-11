import java.util.Scanner;

public class Q16 {
    
    static Scanner sc = new Scanner(System.in);
    
        public static void userin(int a[]){
            for(int i = 0 ; i <a.length ; i++){
                a[i] = sc.nextInt();
        }
    }

    public static void max(int a[]){
        int max = 0;

        for(int i = 0 ; i <a.length ; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        
        int a[] = new int[5];
        userin(a);
        max(a);
        
    }
}
