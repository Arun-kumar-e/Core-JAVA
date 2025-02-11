public class Q17 {
    public static void main(String[] args) {
        
        int a[] = {121, 153 , 9 };

        for(int i = 0 ; i< a.length ; i++){

            int d = a[i];
            int di = 0 ;
            int ar = 0 ;
            int ne = 0 ;

            while(d>0){

                int tem = (d*d*d);

                int rem = d%10;

                ar = ar + (rem * rem * rem);
                
                di = di*10 + rem ;
                d = d/10;
                
                int re = tem%10;
                ne = ne*10 + re;
                tem = tem/10;
                
                if(di==a[i]){
                    System.out.println(a[i] + " Palindrome Number ");
                }

                if(ar == a[i]){
                    System.out.println(a[i] + " Armstrong Number ");
                }

                if(ne == a[i] ){
                    System.out.println(a[i] + " Neon Number ");
                }
            }
        }
    }
}
