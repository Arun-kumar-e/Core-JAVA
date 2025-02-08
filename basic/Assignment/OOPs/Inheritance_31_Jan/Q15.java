class Vehicle{
    void transportation() {
        System.out.println("Vehicle is used for transportation");
    }
}

class Car extends Vehicle{
    void transportation(){
        System.out.println("Car is used for transportation");
    }
}

class Bike extends Vehicle{
    void transportation(){
        System.out.println("Bike is used for transportation");
    }
}
public class Q15 {
    public static void main(String[] args) {
        Car c = new Car();
        c.transportation();
        Bike b = new Bike();
        b.transportation();
    }
}
