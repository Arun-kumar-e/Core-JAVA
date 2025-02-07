interface Shape{
    void calculateArea();
}

class Circle implements Shape{
    public void calculateArea(){
        System.out.println("Area of Circle");
    }
}

class Rectangle implements Shape{
    public void calculateArea(){
        System.out.println("Area of Rectangle");
    }
}

public class Q1{
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.calculateArea();
        r.calculateArea();
    }
}