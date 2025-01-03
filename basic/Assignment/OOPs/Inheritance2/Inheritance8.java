public class Inheritance8 {
    
    public static void main(String[] args) {
        
        SportsCar sc = new SportsCar();
        sc.display();
        sc.display1();
        sc.display2();

    }
}

class Vehicle{
    void display(){
        System.out.println("Vehicle Class");
    }
}

class Car extends Vehicle{
    void display1(){
        System.out.println("Car Class");
    }
}

class SportsCar extends Car{
    void display2(){
        System.out.println("SportsCar Class");
    }
}


