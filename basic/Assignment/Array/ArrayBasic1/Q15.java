public class Q15 {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6,7,8,9,10 };

        for(int i = 0 ; i < a.length-1 ; i++){
            for(int j = 1 ; j<=10 ; j++){
                System.out.println(a[i] + " * " + j + " = " + (a[i]*j) );
            }
            System.out.println();
        }
    }
}
