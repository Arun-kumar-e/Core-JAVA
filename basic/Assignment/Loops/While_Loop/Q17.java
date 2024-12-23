public class Q17 {
    
    public static void main(String[] args) {
        
        int i = 100;

        while (i >= 1) {
            if (i % 5==0 && i % 11== 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
