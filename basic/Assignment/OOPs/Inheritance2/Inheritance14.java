public class Inheritance14 {
    
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.circleDraw(5);

        System.out.println();

        Rectangle r = new Rectangle();
        r.rectangleArea(5, 6);

    }
}

class Shape {

    void draw() {
        System.out.println("");
    }

}

class Circle extends Shape {

    void circleDraw(int r) {
        System.out.println("Area of circle is: " + (3.14*r*r));
    }

}

class Rectangle extends Shape {

    void rectangleArea(int l , int b) {
        System.out.println("Area of rectangle is: " + (l*b));
    }

}
