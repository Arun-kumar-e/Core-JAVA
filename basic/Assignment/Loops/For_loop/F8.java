public class F8 {
    
    public static void main(String[] args) {
        
        int s=0;
        for (int i = 100; i >= 1; i--) {
            if (i%2 != 0) {
                s = s +i;
            }                
        }
        System.out.println("Sum of odd numbers from 1 to 100 is: " + s);
    }
}