public class Q4 {

    public static void print(int[] a) {
        for(int i = 0; i < a.length; i++) {
            int target = a[i];
           
            for(int j = i+1; j < a.length; j++) {
                if(a[j] == target) {
                    System.out.print("The index of " + target + " is ");
                    System.out.print( j + " ");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,2,6,2,7,8,2,9};

        print(a);
    }
}
