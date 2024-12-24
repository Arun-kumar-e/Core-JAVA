public class CarInfo {
    
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", 2020);
        
        car.display();
    }
}


class Car{

    String model ;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    void display(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}