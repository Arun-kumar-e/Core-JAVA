class Shape{
    void calculatesVolume(){
        System.out.println("Volume of Shape");
    }
}

class Circle extends Shape{
}

class Cylinder extends Circle{
    void calculatesVolumeCylinder(){
        System.out.println("Volume of Cylinder");
    }
}
public class Q8 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.calculatesVolumeCylinder();
    }
}
