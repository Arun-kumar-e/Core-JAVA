public class Pattern49 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {

            for(int s = 1 ; s<i ; s++){
                System.out.print("  ");
            }

            for (int j = 10; j >= (2*i); j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
