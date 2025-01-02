public class Question8 {
    
    public static void main(String[] args) {
        
        new Circle(5);
    }
}

class Circle{

    int r ;

    Circle(int r){
        this.r = r;
        System.out.println("Area of circle is " + (2*3.75*(r*r)));
    }
}
