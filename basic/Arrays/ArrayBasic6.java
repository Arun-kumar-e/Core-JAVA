public class ArrayBasic6 {
    public static void printn(int a[]){
        for(int i = 0 ; i <a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        printn(a);

        int b[] = {4,5,6,7,5};
        printn(b);
    }
}
