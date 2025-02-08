class Vehicle{
    void m1(){
        System.out.println("Vehicle class");
    }
}

class Car extends Vehicle{
    void m2(){
        System.out.println("Car class");
    }
}

class SportsCar extends Car{
    void m3(){
        System.out.println("SportsCar class");
    }
}
public class Q10 {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.m1();
        sc.m2();
        sc.m3();
    }
}
