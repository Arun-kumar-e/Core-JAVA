public class Pattern58 {
    
    public static void main(String[] args) {
        
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(n+" ");
                        n++;
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print(n+" ");
                        n++;
                    }
                }
            }

            System.out.println();
        }
    }

    /*

               OR

               
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int num = 1;  // Start number for the pattern

        for (int i = 1; i <= rows; i++) { // Loop through rows
            for (int j = 1; j <= 5; j++) { // Loop through columns
                if ((i + j) % 2 == 0) { // Check if position is even
                    System.out.print("* ");
                } else { // Otherwise, print a number
                    System.out.print(num + " ");
                    num++; // Increment the number
                }
            }
            System.out.println(); // Move to the next line
        }
    } */

}
