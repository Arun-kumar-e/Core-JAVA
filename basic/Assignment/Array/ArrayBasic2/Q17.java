import java.util.Scanner;

public class Q17 {
    
    static Scanner sc = new Scanner(System.in);
    
        public static void userin(int a[]){
            for(int i = 0 ; i <a.length ; i++){
                a[i] = sc.nextInt();
    }
}

    public static void min(int a[]){
        int min = 0;

        for(int i = 0 ; i <a.length ; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        
        int a[] = new int[5];
        userin(a);
        min(a);
    }
}
