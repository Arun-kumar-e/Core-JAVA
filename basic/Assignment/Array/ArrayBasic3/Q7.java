public class Q7 {

    public static void print(int[] a) {

        for (int i = 0 ; i<a.length ; i++) {
            boolean present = false;

            for (int j = 0 ; j<a.length ; j++) { 
                if (i != j && a[i] == a[j]) {
                    present = true;
                    break; 
                } 
            }
            if (!present) {
                System.out.println("Element " + a[i] + " at index " + i);
            }
        }
    } 
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,3,2,1};
        print(a);
    }
}
