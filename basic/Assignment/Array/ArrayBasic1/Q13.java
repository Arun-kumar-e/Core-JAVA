public class Q13 {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0 ; i < a.length ; i++){
            if(i == 1 || i == 3 || i== 6 || i== 8){
                System.out.print(a[i] + " ");
            }
            continue;
        }
    }
}
