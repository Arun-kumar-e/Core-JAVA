class Shape{
    void calculatesArea(){
        System.out.println("The area of shape is: ");
    }
}

class Circle extends Shape{
    void calculatesArea(){
        System.out.println("The area of circle is: ");
    }
}

class Rectangle extends Shape{
    void calculatesArea(){
        System.out.println("The area of rectangle is: ");
    }
}
public class Q16 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculatesArea();
        Rectangle r = new Rectangle();
        r.calculatesArea();
    }
}
