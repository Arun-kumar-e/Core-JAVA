import java.util.Scanner;

public class Q12 {

    static Scanner sc = new Scanner(System.in);

    public static void userin(int a[]){
        for(int i = 0 ; i <a.length ; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        
        int a[] = new int[6];

        userin(a);

        for(int i  = 0 ; i < a.length ; i++){
            if (a[i] == 5) {
                System.out.println("The target number is at " + i );
            }

            continue;
        }
    }
}
