public class Q3 {

    public static void print(int[] a) {
        int count = 0 ;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j] ) {
                    count++;
                    System.out.println(" Index is " + i + " and " + j);
                }
            }    
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,3,5,6};

        print(a);
    }
}
