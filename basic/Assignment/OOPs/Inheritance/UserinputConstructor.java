import java.util.Scanner;

public class UserinputConstructor {
    
    public static void main(String[] args) {
        
        new C();

    }
}

class A{

    Scanner sc = new Scanner(System.in);
    A(){
        System.out.println("Enter a number for Class A addition: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition of two numbers is: " + (a+b));
    }

}

class B extends A{

   
    B(){
        System.out.println("Enter a number for Class B multiplication: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition of two numbers is: " + (a*b));
    }

}

class C extends B{

    
    C(){
        
        System.out.println("Class C is called");
    }

}
