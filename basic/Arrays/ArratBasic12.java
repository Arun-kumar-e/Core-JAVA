public class ArratBasic12 {

    public static void unique1(int a[]) {
        
        for (int i = 0 ; i <= a.length/2 ; i++){
            int count = 1 ;
            for (int j = i+1 ; j < a.length ; j++){
                if (a[i] == a[j]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(a[i] + " is a unique element");
            }
        }
   }


    // public static void unique2(int a[]) {
        
    //     for (int i = 0 ; i < a.length ; i++){
    //         for (int j = i+1 ; j < a.length ; j++){
    //             if (a[i] == a[j]){
    //                 a[j]=-1;
    //             }
    //         }
    //     }

    //         for (int i = 0 ; i < a.length ; i++){
    //             if (a[i] >0){
    //                 System.out.println(a[i] + " is a unique element");
    //             }
    //         }
        
    // }

    public static void uniqueElements(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int count = 0; // Reset count for each element
            
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++; // Count occurrences of the element
                }
            }

            if (count == 1) { // If element appears only once, it's unique
                System.out.println(a[i] + " is a unique element");
            }
        }
    }

    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,3,2,1};
        // unique1(a);
        uniqueElements(a);
        
    }
        
}
