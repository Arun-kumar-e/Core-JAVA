public class Pattern20 {
    
    public static void main(String[] args) {
        
        int n = 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(n +" ");
                n+=2;
            }
            System.out.println();
        }
    }
}
