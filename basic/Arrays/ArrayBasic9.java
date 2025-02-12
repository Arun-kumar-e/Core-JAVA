public class ArrayBasic9 {
    
    public static void printn(int a[]){
        for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5};
        int b[] = a.clone();

        a[0] = 0;
        a[1] = 0;

        printn(a);
        printn(b);
    }
}
