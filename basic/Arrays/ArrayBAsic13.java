public class ArrayBAsic13 {

    public static void printn(int a[]) {

        int b[] = new int[a.length];
        int zero = 0 ;
        int one = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zero++;
            } 
        }
        for (int i = 0; i < a.length; i++) {
            if(i<zero){ 
                b[i] = 0;
            }else{
                b[i] = 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        
        int a[] = {0,1,1,0,1,0,1,0,0};
        printn(a);

    }
}
