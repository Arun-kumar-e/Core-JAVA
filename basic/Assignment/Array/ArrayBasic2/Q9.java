import java.util.Scanner;

public class Q9 {
    
    static Scanner sc =new Scanner(System.in);

    public static void userin(int a[]){
        for(int i = 0 ; i <a.length ; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void printn(int a[]){
       for(int i = 0 ; i< a.length ; i++){
           if(i%2 != 0){
              System.out.print(a[i] + " ");
           }
       }
    }

    public static void main(String[] args) {

        int a[] = new int[5];

        userin(a);
        printn(a);
   }
}
