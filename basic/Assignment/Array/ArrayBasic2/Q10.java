import java.util.Scanner;

public class Q10 {
    
    static Scanner sc = new Scanner(System.in);

    public static void userin(int a[]){
        for(int i = 0 ; i <a.length ; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void printn(int a[]){
       for(int i = 0 ; i< a.length ; i++){
           if(a[i]%2 == 0){
              System.out.print("First even element is " + a[i]);
              break;
           }
       }

       System.out.println();

       for(int j = a.length-1 ; j>=0 ; j++ ){
          if (a[j]%2 == 0) {
            System.out.print("last even element is " + a[j]);
              break;
          }
       }
    }

    public static void main(String[] args) {
        
        int a[] = new int[8];

        userin(a);
        printn(a);

    }
}
