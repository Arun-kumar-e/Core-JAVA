public class Question7 {
    
    public static void main(String[] args) {
        
        new Rectangle(55, 540);
        new Rectangle(455, 55.55f);

    }
}

class Rectangle{

    Rectangle(int breadth , int length){
        System.out.println("Consructor overloading");
    }

    Rectangle(int length , float breadth){
        System.out.println("Avoided Constructor overloading by changing Data type");
    }
    
}
