import java.util.*;
public class ArrayBasic4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0 ; i<5 ; i++){
            a[i] = s.nextInt();
        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.print(a[i] + " ");
        }

        s.close();
    }
}
