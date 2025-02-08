class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("Bird is Flying");
    }
}

class Mammal extends Animal{
    public void eat(){
        System.out.println("Mammal is Walking");
    }
}
public class Q19 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        Mammal m = new Mammal();
        m.eat();
    }
}
