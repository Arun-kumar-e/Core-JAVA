public class ArrayBasic10 {

    public static void printn(int a[]){
        for(int i = 0 ; i< a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        printn(new int[]{1,2,3,4,5});
    }
}
