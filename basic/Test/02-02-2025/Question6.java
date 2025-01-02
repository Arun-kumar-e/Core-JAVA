public class Question6 {
    
    public static void main(String[] args) {
        
        new Car();

        System.out.println();
        new Car("Brand" , "Model");

    }
}

class Car{

    Car(){
        String brand = "RR";
        String model = "model";
        System.out.println("Brand in default constructor " + brand);
        System.out.println("model in default constructor " + model);
    }

    Car(String brand, String model){
        System.out.println("Brand in parameterized constructor " + brand);
        System.out.println("model in parameterized constructor " + model);
    }
}
