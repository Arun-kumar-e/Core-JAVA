import java.util.Scanner;

public class Q2 {

    static Scanner sc = new Scanner(System.in);

    public static void userin(char a[]){
        for(int i = 0 ; i<a.length ; i++){
           a[i] = sc.next().charAt(0);
        }
    }

    public static void printn(char a[]){
        for(int i = 0 ; i< a.length ; i++){
            if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u'){
            System.out.print(a[i] + " is vowel");
           }
        }
   }

    public static void main(String[] args) {
        char a[] = new char[4]; 
        userin(a);
        printn(a);
    }
}
