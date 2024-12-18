import java.util.Scanner;

public class Season {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int month = sc.nextInt();

        switch (month) {
            case 3,4,5:
            System.out.println("Spring");
            break;

            case 6,7,8:
            System.out.println("Summer");
            break;

            case 9,10,11:
            System.out.println("Autumn");
            break;

            case 12,1,2:
            System.out.println("Winter");
            break;

            default:
            System.out.println("Invalid month");
            break;
        }

        sc.close();
    }
}
