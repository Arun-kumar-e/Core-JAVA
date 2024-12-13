public class Q21 {
    
    public static void main(String[] args) {
        
        int i = 100;
        int sum = 0;
        while (i >= 1) {
            if(i%2==0) {
                sum = sum + i;
            }
            i--;
        }
        System.out.println(sum);
    }
}
