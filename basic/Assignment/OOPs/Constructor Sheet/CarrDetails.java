public class CarrDetails {
    
    public static void main(String[] args) {
        
        Care c = new Care("John");
        c.display();

    }
}

class Care{

    String name;
    int year;

    Care(String name){
        this.name = name;
        year = 2024;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Year: "+year);
    }

}
