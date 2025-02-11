public class Q20 {
    public static void main(String[] args) {
        
        char a[] = {'a','r','i','o','d','s'};

        for(int i = 0 ; i<a.length ; i++){
            if(a[i] == 'a' || a[i] == 'e' ||a[i] ==  'i' || a[i] ==  'o' ||a[i] ==  'u'){
                continue;
            }
            else{
                System.out.println("Consonant " + a[i]);
            }
        }
    }
}
