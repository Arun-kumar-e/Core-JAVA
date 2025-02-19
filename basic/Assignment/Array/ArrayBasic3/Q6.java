public class Q6 {

    public static void print(int[] a) {
        for(int i = 0; i < a.length; i++) {}
    }

    public static void fre(int a[]) {
        int max = 0;
        int el = 0;
        for(int i = 0 ; i <a.length ; i++ ){
            int fre = 1;

            if (a[i] == -1) {
                continue;
            }

            for(int j = i+1 ; j < a.length ; j++){

                if(a[i] == a[j]){
                    a[j] = -1;
                    fre++;

                    if (fre > max) {
                        max = fre ;
                        el = a[i];
                    }
                }
            }
            System.out.println("Frequency of " + a[i] + " is " + fre);   
        }
        System.out.println("Max frequency is " + max + " Element is " + el);
    }
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,2,4,3,2,5,7,2,1 };

        fre(a);

    }
}
