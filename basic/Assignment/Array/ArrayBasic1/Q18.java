public class Q18 {
    public static void main(String[] args) {
        
        int a[] = {123,567,453,678 ,876};

        for(int i = 0 ; i < a.length ; i++){
            int d = a[i];
            int di = 0;

            while(d>0){
                int rem = d%10;
                di = di + rem;
                d = d/10;
            }

            if(di%2 == 0){
                System.out.println("sum of "+a[i] + " is even" );
            }
        }
    }
}
