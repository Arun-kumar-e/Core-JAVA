public class F9 {
    
    public static void main(String[] args) {
        
        int s = 0 ;
        for (int i = 50; i <= 1000; i++) {
            if (i % 2 == 0) {
                s = s + i;
            }
        }

        System.out.println("Sum of even numbers from 50 to 1000 is: " + s);
    }
}
