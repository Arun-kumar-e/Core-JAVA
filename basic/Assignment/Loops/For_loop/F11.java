public class F11 {
    
    public static void main(String[] args) {

        System.out.print("Enter the value: ");
        int n = 10;
        int i = 2;
        
        for( i = 1; i <= n; i++) {
            for(int j = 1; j <= 10; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("\n\ntable of " + (i+1) + "\n\n");
        }
    }
}
