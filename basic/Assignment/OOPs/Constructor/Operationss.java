import java.util.Scanner;

class ClassA {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int div(int a, int b) {
        return a / b;
    }

    int multi(int a, int b) {
        return a * b;
    }
}

class ClassB {
    boolean even(int a) {
        return a % 2 == 0;
    }
}

class ClassC {
    boolean odd(int a) {
        return a % 2 != 0;
    }
}

public class Operationss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers for ClassA operations:");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        ClassA a = new ClassA();
        System.out.println("Addition: " + a.add(num1, num2));
        System.out.println("Subtraction: " + a.sub(num1, num2));
        System.out.println("Division: " + a.div(num1, num2));
        System.out.println("Multiplication: " + a.multi(num1, num2));

      
        System.out.print("Enter a number to check if it is even: ");
        int evenNum = sc.nextInt();
        ClassB b = new ClassB();
        System.out.println("Is the number even? " + b.even(evenNum));

        
        System.out.print("Enter a number to check if it is odd: ");
        int oddNum = sc.nextInt();
        ClassC c = new ClassC();
        System.out.println("Is the number odd? " + c.odd(oddNum));

        sc.close();
    }
}
