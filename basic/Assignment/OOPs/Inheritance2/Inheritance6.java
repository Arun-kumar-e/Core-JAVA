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


