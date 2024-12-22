public class Pattern45 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            int n = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(n+" ");
                n+=i;
            }
            System.out.println();
        }
    }
}
