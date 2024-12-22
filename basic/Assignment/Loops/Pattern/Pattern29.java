public class Pattern29 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {

            for(int j = 1 ; j <= i; j++){
                System.out.print(i);
            }

            for(int s = 5 ; s >i ; s--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
