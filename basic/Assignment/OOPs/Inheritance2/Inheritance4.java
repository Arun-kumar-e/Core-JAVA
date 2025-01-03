public class Inheritance4 {
    
    public static void main(String[] args) {
        
        ElectricCar ec = new ElectricCar();
        ec.display();

    }
}

class Vehicle {
    void display() {
        System.out.println("Vehicle class");
    }
}

class Car extends Vehicle {
    
    void display() {
        System.out.println("Car class");
    }
}

class ElectricCar extends Car {
    
    void display() {
        System.out.println("ElectricCar class");
    }
}

