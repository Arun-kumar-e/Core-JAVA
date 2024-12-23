public class Pattern51 {
    
    public static void main(String[] args) {
        
        char ch = 'a';
        for (int i = 1; i <= 5; i++) {

            for(int J = 1 ; J<=i ; J++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
