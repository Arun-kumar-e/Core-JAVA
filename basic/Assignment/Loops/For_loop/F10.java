public class F10 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1000 ; i >= 500 ; i--) {
            if (i%2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of odd numbers from 1000 to 500 is: " + sum);
    }
}