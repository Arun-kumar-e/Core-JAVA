public class Pattern59 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            int n = i;
            for(int j = 1 ; j <= 5 ; j++){
                System.out.print(n+" ");
                n+=5;
            }
            System.out.println();
        }
    }
}
