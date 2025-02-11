import java.util.Scanner;

public class Q13 {
    
    static Scanner sc = new Scanner(System.in);
    
        public static void userin(int a[]){
            for(int i = 0 ; i <a.length ; i++){
                a[i] = sc.nextInt();
        }
    }

    public static void printn(int a[]){
        int count = 0 ;
        int target =  2;
        for(int i = 0 ; i< a.length ; i ++){
            if(target == a[i]){
                System.out.println("The Duplicated is at idex " + i);
                count++;
            }
        }

         System.out.println("The target it repeted " + count + " times");
    }

    public static void main(String[] args) {
        
        int a[] = new int[5];

        userin(a);
        printn(a);

    }
}
