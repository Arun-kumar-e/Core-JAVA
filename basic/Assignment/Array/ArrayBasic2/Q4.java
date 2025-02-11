import java.util.Scanner;

public class Q4 {
    
    static Scanner sc = new Scanner(System.in);

    public static void userin(String a[]){
        for(int i = 0 ; i<a.length ; i++){
           a[i] = sc.next();
        }
    }

    public static void printn(String a[]){
        int count = 0;
        for(int i = 0 ; i< a.length ; i++){
            if(a[i].equals("apple")){
                count++;
            }
        }

        System.out.println("Count of Apple is " + count);
   }

   public static void main(String[] args) {
    
    String a[] = new String[5];
    userin(a);
    printn(a);
   }
}
