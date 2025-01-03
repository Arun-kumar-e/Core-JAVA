/*
 * Implement a program where a Shape class is inherited by a Circle class, and then a Cylinder class inherits from the Circle class to calculate volume.
 */
public class Inheritance6 {
    
    public static void main(String[] args) {
        
        Cylinder c = new Cylinder();
        System.out.println(c.a);
        
    }
}

class Shape {
   
    String a;
}

class Circle extends Shape {
    Circle() {
        a = "Circle";
    }
}

class Cylinder extends Circle {
    Cylinder() {
        a = "Cylinder";
    }
}


