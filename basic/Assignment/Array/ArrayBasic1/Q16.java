public class Q16 {
    public static void main(String[] args) {
        
        int a[] = {123,567,453,678 ,876};

        

        for(int i = 0 ; i< a.length ; i++){
            int d = a[i];
            int digit = 0;

            while(d>0){
                int rem = d%10;
                digit = digit*10 + rem;
                d = d/10;
            }

            System.out.print(digit + " ");            
        }

       
    }
}
