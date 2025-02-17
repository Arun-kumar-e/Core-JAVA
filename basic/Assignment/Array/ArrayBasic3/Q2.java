public class Q2 {

    public static void print(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int k = j+1; k < a.length; k++) {
                    if(a[i]+a[j]+a[k] == 12) {
                        count++;
                        System.out.println(a[i] + " + " + a[j] + " + " + a[k] + " == 12 ");
                        System.out.println("Index is " + i + "," + j + "-0," + k);
                    }
                }
            }    
        }
        System.out.println();
        System.out.println("Total count is " + count);
    }
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        print(a);
    }
}
