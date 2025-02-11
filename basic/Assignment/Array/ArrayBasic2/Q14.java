import java.util.Scanner;

public class Q14 {
    
    static Scanner sc = new Scanner(System.in);

    public static void userin(int a[]){
        for(int i = 0 ; i <a.length ; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void printn(int a[]){

        System.out.println("Enter the target to find");
        sc.nextLine();
        int target = sc.nextInt();

        for(int i = 0 ; i < a.length ; i++){
            int d = a[i];
            int sum = 0 ;

            if (a[i] == target ) {
                
                while (d>0) {

                    int rem = d % 10;
                    sum = sum + (rem*rem*rem);
                    d = d/10;

                }

                if(sum == a[i]){
                    System.out.println("Armstrong number");
                }else{
                    System.out.println("Not a armstrong number ");
                }
                
            }

            continue;
        }
    }

    public static void main(String[] args) {
        
        int a[] = new int[6];

        userin(a);
        printn(a);
    }
}
