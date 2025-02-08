class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    void drawCircle(){
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape{
    void drawSquare(){
        System.out.println("Drawing Square");
    }
}
public class Q20 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.drawCircle();
        c.draw();
        Square s = new Square();
        s.drawSquare();
        s.draw();
    }
}
