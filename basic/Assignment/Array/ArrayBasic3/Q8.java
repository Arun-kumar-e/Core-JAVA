public class Q8 {
    
    public static void printn(int a[]) {
        for(int i = 0 ; i<a.length ; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void swap(int a[], int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    
    public static void swap(int a[] ) {
        int left = 0;
        int right = a.length -1;

        while(left<=right) {
             if(a[left] == 0){
                left++;
            }

            if (a[right] == 1) {
                right--;
            }

            if(a[left] == 1 && a[right] == 0){
                swap(a, left, right);
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        
        int a[] = {0,1,0,1,1,0,0,1,1};
        swap(a);
        printn(a);
    }
}
