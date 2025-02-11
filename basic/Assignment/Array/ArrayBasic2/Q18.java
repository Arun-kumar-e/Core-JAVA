import java.util.Scanner;

public class Q18 {
    
    static Scanner sc = new Scanner(System.in);
    
        public static void userin(int a[]){
            for(int i = 0 ; i <a.length ; i++){
                a[i] = sc.nextInt();
            }
        }

        public static void maxAndPrime(int a[]){
            int max = 0;
            for(int i = 0 ; i <a.length ; i++){
                if(max < a[i]){
                    max = a[i];
                }
            }
            System.out.println(max);

            int count = 0 ;
            
            for(int i = 1 ; i <= max ; i++){
                
                if(max%i == 0){
                    count++;
                }else{
                    continue;
                }
            }

            if(count == 2){
                System.out.println(max+ " is prime number");
            }else{
                System.out.println(max+ " is not prime number");
            }
        }

    public static void main(String[] args) {
        
        int a[] = new int[5];
        userin(a);
        maxAndPrime(a);
    }
}
