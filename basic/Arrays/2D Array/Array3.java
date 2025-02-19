import java.util.Scanner;

public class Array3 {

    static Scanner sc = new Scanner(System.in);

    public static void write(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int row,column;
        System.out.println("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        column = sc.nextInt();
        int [][] arr = new int[row][column];
        
        System.out.println("Enter the elements: ");
        write(arr);

        System.out.println("Entered element are: ");
        print(arr);
    }
}
