//Swap Array 

public class ArrayBasic14 {
    
    public static void printn(int a[]) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void swap(int a[]) {
        int temo = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temo;
    }
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        swap(a);
        printn(a);
    }
}
