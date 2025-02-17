public class Q2 {

    public static void print(int a[]) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int a[] = {0,1,2,3,4,5,6,7,8,9};

        int b[] = a;
        int c[] = b;

        a[2] = 45;
        a[4] = 45;
        a[6] = 45;

        print(a);
        print(b);
        print(c);

    }
}
