public class Inheritance13 {
    
    public static void main(String[] args) {
        
        Car c = new Car();
        c.display();
        c.carDisplay();

        System.out.println();

        Bike b = new Bike();
        b.display();
        b.bikeDisplay();

    }
}

class Vehicle {
    void display() {
        System.out.println("Vehicle class");
    }
}

class Car extends Vehicle {
    void carDisplay() {
        System.out.println("Car class");
    }
}

class Bike extends Vehicle {
    void bikeDisplay() {
        System.out.println("Bike class");
    }
}
