import java.util.Scanner;

public class Q5 {
    
    static Scanner sc = new Scanner(System.in);

    public static void userin(int a[]){
        for(int i = 0 ; i<a.length ; i++){
           a[i] = sc.nextInt();
        }
    }

    public static int summ(int a[]){
        int sum = 0;
        for(int i = 0 ; i<a.length ; i++){
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        
        int a[] = new int[5];
        int b[] = new int[5];

        userin(a);
        userin(b);

        if(summ(a) > summ(b)){
            System.out.println("Sum of a is greater then b");
        }else{
            System.out.println("Sum of a is greater then b");
        }

    }
}
