/*
 * Implement a program where a Car class inherits from a Vehicle class, and call the inherited method in the subclass.
 */
public class Inheritance3 {
    
    public static void main(String[] args) {
        
        Car c = new Car();
        c.display();

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
