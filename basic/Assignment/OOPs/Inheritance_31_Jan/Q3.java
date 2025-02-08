class Vechicle{
    void run(){
        System.out.println("vechicle is running");
    }
}

class Car extends Vechicle{
    void run(){
        System.out.println("Car is running");
    }
}
public class Q3 {
    public static void main(String[] args) {
        Vechicle v = new Car();
        v.run();
    }
}
