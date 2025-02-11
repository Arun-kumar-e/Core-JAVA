public class Q22 {
    public static void main(String[] args) {
        
        int a[] = {123,8675,6434,7657,8766 };

        for(int i = 0 ; i<a.length ; i++){
            int sum = 0;
            int d = 0 ;
            if(a[i]%2 != 0){
                d = a[i];

                
            while(d>0){
                int rem = d%10;
                if(rem%2!= 0){
                    sum = sum + rem;
                }

                d = d/10;
            }

            System.out.println("Sum of odd numbers of a element is " + sum);
            }

        }
    }
}
