public class Q12 {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0 ; i < a.length ; i++){
            if(i == 6 || i == 8){
                continue;
            }
            System.out.print(a[i] + " ");
        }
    }
}
