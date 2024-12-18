import java.util.Scanner;
public class TicketBooking {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tickets: ");
        int tickets = sc.nextInt();
        System.out.println();

        float price = 0f;

        if (tickets < 5 || tickets >41 ) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets can be Booked");

            sc.close();
            return;
        } else{

            System.out.println("Do you want refreshment (y/n): ");
            char refreshment = sc.next().charAt(0);

            System.out.println("Do you have coupon code (y/n):");
            char coupon = sc.next().charAt(0);

            System.out.println("Enter the circle (k/q):");
            char circle = sc.next().charAt(0);

            if (circle == 'k') {
                price = tickets * 75f;
            } else if (circle == 'q') {
                price = tickets * 150f;
            } else {
                System.out.println("Invalid Circle");
                sc.close();
                return;
            }

            if (refreshment == 'y') {
                price = price + (tickets*50f);
            }

            if (tickets >20) {
                price -= price * 0.1f;
            }

            if (coupon == 'y') {
                price -= price * 0.02f;
            }
        }

        System.out.println("Total Price: " + price);

        sc.close();
    } 
}