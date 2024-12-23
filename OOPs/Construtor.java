class Car {
    // Instance variables
    String make;
    String model;
    int year;

    // Default constructor (no arguments)
    Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    
}

public class Construtor {
    
    public static void main(String[] args) {
        // Using default constructor
        Car car1 = new Car();
        car1.displayInfo();

        System.out.println("------------------");

        // Using parameterized constructor
        Car car2 = new Car("Toyota", "Camry", 2020);
        car2.displayInfo();
    }
    
}
