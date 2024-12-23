import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Armstrong Number");
        int armnum = sc.nextInt();
        int temp = armnum;
        float s = 0 , r = 0 ;
        while(armnum > 0) {
            r = armnum % 10;
            s = s + r * r * r;
            armnum = armnum / 10;
        }
        if(s == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
    
}
