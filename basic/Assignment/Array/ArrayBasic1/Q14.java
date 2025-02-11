public class Q14 {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = a.length-1 ; i>=0 ; i-- ){
            if(i == 8|| i == 6 || i == 3 || i == 1 ){
                System.out.print(a[i] + " ");
            }
            continue;
        }
    }
}
