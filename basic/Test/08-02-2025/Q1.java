class calculator{

    void add(int a, int b){
        System.out.println("Sum of two numbers: "+(a+b));
    }

    void add(int a, int b, int c){
        System.out.println("Sum of three numbers: "+(a+b+c));
    }

    void add(double a, double b){
        System.out.println("Sum of two double numbers: "+(a+b));
    }

}

public class Q1 {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.add(10, 20);
        c.add(10, 20, 30);
        c.add(10.5, 20.5);
    }
}