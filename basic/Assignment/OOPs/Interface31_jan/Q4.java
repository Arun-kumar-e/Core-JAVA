interface MathConstants{
    double PI = 3.14;
    double E = 2.71;
}

class MathOperations implements MathConstants{
    void display(){
        System.out.println("Area of circle = " + PI * E);
    }
}
public class Q4 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        m.display();
    }
}
