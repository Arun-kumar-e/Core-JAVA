public class Q21 {
    public static void main(String[] args) {
        
        int a[] = {123,8675,6434,7657,8766};

        for (int i = 0 ; i< a.length ; i++){
            int d = a[i];

            while(d>0){
                int rem = d%10;

                if(rem%2== 0){
                    System.out.println(rem + " is the even number in elemet " + a[i]);
                }

                d = d/10;
            }
        }
    }
}
