interface Vehicle {
    void Start();
    void Stop();
}

interface ElectricVehicle{
    void chargeBattery();
}

class TeslsCar implements Vehicle, ElectricVehicle {
    public void Start() {
        System.out.println("Tesla car started");
    }
    public void Stop() {
        System.out.println("Tesla car stopped");
    }
    public void chargeBattery() {
        System.out.println("Tesla car battery charged");
    }
}
public class Q6 {
    public static void main(String[] args) {
        TeslsCar tesla = new TeslsCar();
        tesla.Start();
        tesla.chargeBattery();
        tesla.Stop();
    }
}
