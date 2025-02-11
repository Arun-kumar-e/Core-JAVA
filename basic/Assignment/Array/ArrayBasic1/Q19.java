public class Q19 {
    public static void main(String[] args) {
        
        char a[] = {'a','r','i','o','d','s'};

        for(int i = 0 ; i<a.length ; i++){
            if(a[i] == 'a' || a[i] == 'e' ||a[i] ==  'i' || a[i] ==  'o' ||a[i] ==  'u'){
                System.out.println("Vowel " + a[i]);
            }
        }
    }
}
