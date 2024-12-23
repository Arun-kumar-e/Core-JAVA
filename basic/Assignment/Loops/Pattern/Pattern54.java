public class Pattern54 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++){
            char ch ='A';

            for (int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            
            for(int s = 5 ; s>i ; s--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
