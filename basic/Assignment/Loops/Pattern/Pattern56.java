public class Pattern56 {
    
    public static void main(String[] args) {
        
        char ch = 'E';
        for (int i = 1; i <= 5; i++) {

            for(int s = 1 ; s < i ; s++){
                System.out.print("*");
            }
            
            for(int j = 5 ; j >= i ; j--){
                System.out.print(ch);
            }
            ch--;
            System.out.println();
        }
    }
}
