public class Pattern40 {
    
    public static void main(String[] args) {
        
        int s = 1;
        for(int i = 1 ; i <= 5 ; i++){
            int n = s;
            
            for(int j = 1 ; j <= 5 ; j++){
                System.out.print(n +" ");
                n+=2;
            }
           s+=2;
            System.out.println();
        }
    }
}
