public class DetailsPerson {
    
    public static void main(String[] args) {
        
        Prson p = new Prson("John", 25);
        p.display();
    }
}

class Prson{

    String name;
    int age;

    Prson(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
