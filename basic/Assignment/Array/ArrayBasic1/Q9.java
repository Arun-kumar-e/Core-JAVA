public class Q9 {
    public static void main(String[] args) {

        int a[] = {12,67,46,435,607,385,33,335,34,23};
        int n = a.length/2;
        for(int i = n-1 ; i >= 0 ; i--){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for(int j = a.length-1 ; j >= n ;j-- ){
            System.out.print(a[j] + " ");
        }
    
    }
}
