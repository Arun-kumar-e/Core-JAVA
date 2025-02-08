class Shape{
    void calculatesArea(){
        System.out.println("The area of shape is: ");
    }
}

class Rectangle extends Shape{
    void calculatesArea(){
        System.out.println("The area of rectangle is: ");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calculatesArea();
    }
}
