class Vehicle {
    void drive() {
        System.out.println("Vehicle ");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car ");
    }
}

class ElectricCar extends Car {
    void drive() {
        System.out.println("ElectricCar ");
    }
}
public class Q6 {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar();
        v.drive();
    }
}