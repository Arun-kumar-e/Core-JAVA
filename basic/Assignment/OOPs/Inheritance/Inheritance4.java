import java.util.Scanner;

public class Inheritance4 {
    
    public static void main(String[] args) {
        
        new B();

    }
}

class A{

    int n1, n2;
    Scanner sc = new Scanner(System.in);
    
    A(){
        
        System.out.println("Enter two numbers for multiplication: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();


        System.out.println("multiplication: " + (n1 * n2));
    }
}

class B extends A{

    int n3,n4;

    B(){
        System.out.println("Enter two more numbers for division: ");
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        System.out.println("Division: " + (n1 / n2));
    }
}
