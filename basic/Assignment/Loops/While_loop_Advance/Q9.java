import java.util.Scanner;

public class Q9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Even Number");
            System.out.println("num");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                      int a = 1;
                      while (a<=100) {
                        if(a % 2 == 0) {
                            System.out.println(a);
                        }
                      }
                    break;
                
                case 2:
                      int b = 1;
                      int sum = 0;
                      while (b<=100) {
                        if(b % 2 == 0) {
                            sum = sum + b;
                      }    
                      System.out.println(sum);
                    }
                    break;

                case 3:
                     int c = sc.nextInt();    
                     int d = sc.nextInt();    

                     while (c <= d) {
                        if (c % 2 == 0) {
                            System.out.println(c);
                        }
                        c++;
                    }
                    break;

                case 4:
                     int e = sc.nextInt();    
                     int f = sc.nextInt();
                     int su = 0;

                     while (e <= f) {
                         su = su + e;
                         e++;
                     }
                     System.out.println(su);
                    break;

                default:
                     System.out.println("Invalid");
                    break;
            }
        } else if (num % 2 == 1) {
            System.out.println("Odd Number");

            System.out.println("num");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                      int a = 1;
                      while (a<=100) {
                        if(a % 2 != 1) {
                            System.out.println(a);
                        }
                      }
                    break;
                
                case 2:
                      int b = 1;
                      int sum = 0;
                      while (b<=100) {
                        if(b % 2 != 1) {
                            sum = sum + b;
                      }    
                      System.out.println(sum);
                    }
                    break;

                case 3:
                     int c = sc.nextInt();
                     int d = sc.nextInt();

                     while (c <= d) {
                        if (c % 2 != 1) {
                            System.out.println(c);
                        }
                        c++;
                    }
                    break;

                case 4:
                     int e = sc.nextInt();    
                     int f = sc.nextInt();
                     int su = 0;

                     while (e <= f) {
                         su = su + e;
                         e++;
                     }
                     System.out.println(su);
                    break;

                default:
                     System.out.println("Invalid");
                    break;
                  }    
            
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
