public class Q5 {

    public static void print(int a[]){
        for(int i = 0 ; i <a.length ; i++ ){
            int fre = 1;

            if (a[i] == -1) {
                continue;
            }

            for(int j = i+1 ; j < a.length ; j++){

                if(a[i] == a[j]){
                    a[j] = -1;
                    fre++;
                }
            }
            System.out.println("Frequency of " + a[i] + " is " + fre);   
        }
    }

    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,2,4,3,2,5,7,2,1};

        print(a);
    }
}
