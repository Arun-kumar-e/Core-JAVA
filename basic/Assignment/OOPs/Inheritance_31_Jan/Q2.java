class Mammal {
    public void speak(){
        System.out.println("Mammal speaks");
    }
}

class Dog extends Mammal{
    public void speak(){
        System.out.println("Dog barks");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Mammal m = new Dog();
        m.speak();
    }
}
