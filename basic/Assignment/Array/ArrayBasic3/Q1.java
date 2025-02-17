public class Q1{

    public static void print(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i]+a[j] == 8) {
                    count++;
                    System.out.println(a[i] + " + " + a[j] + " == 8 ");
                    System.out.println("Index is " + i + " and " + j);
                }
            }    
        }
        System.out.println();
        System.out.println("Total count is " + count);
    }

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,10};

        print(a);

    }
}