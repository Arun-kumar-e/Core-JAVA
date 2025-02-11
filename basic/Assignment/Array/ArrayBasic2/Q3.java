import java.util.Scanner;

public class Q3 {
    
    static Scanner sc = new Scanner(System.in);

    public static void userin(char a[]){
        for(int i = 0 ; i<a.length ; i++){
           a[i] = sc.next().charAt(0);
        }
    }

    public static void printn(char a[]){
        int countVowel = 0 ;
        int countConstant = 0;
        for(int i = 0 ; i< a.length ; i++){
            if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u'){
            countVowel++;
           }
           else{
            countConstant++;
           }
        }

        System.out.println("Vowel in array is " + countVowel);
        System.out.println("Consonant in array is " + countConstant);
   }

    public static void main(String[] args) {
        char a[] = new char[5];

        userin(a);
        printn(a);
    }
}
