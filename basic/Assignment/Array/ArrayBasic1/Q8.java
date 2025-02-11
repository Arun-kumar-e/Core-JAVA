public class Q8 {
    public static void main(String[] args) {
        int a[] = {12,67,46,435,607,385,33,335,34,23};
        int n = (a.length-1)/2;

        for(int i = n ; i >= 0 ; i--){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for(int j = n+1  ; j <= a.length-1 ;j++ ){
            System.out.print(a[j] + " ");
        }
    }
}
