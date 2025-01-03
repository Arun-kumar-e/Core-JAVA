public class Inheritance9 {
    
    public static void main(String[] args) {
        
        Mansion m = new Mansion();
        m.setNoOfbuilding(10);
        m.setNoOfHouse(20);
        m.setNoOfMansion(30);
        m.display();
        m.display1();
        m.display2();

    }
}

class Building{

    int noOfbuilding ;

    void setNoOfbuilding(int noOfbuilding){
        this.noOfbuilding = noOfbuilding;
    }

    void display(){
        System.out.println("No of Building: " + noOfbuilding);
    }
}

class House extends Building{

    int noOfHouse;

    void setNoOfHouse(int noOfHouse){
        this.noOfHouse = noOfHouse;
    }

    void display1(){
        System.out.println("No of House: " + noOfHouse);
    }
}

class Mansion extends House{

    int noOfMansion;

    void setNoOfMansion(int noOfMansion){
        this.noOfMansion = noOfMansion;
    }
    void display2(){
        System.out.println("No of Mansion: " + noOfMansion);
    }
}


