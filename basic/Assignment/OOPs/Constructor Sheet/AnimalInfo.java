public class AnimalInfo {
    
    public static void main(String[] args) {
        
        Animal animal = new Animal("Dog", "Mammal");
        
        animal.display();

    }
}

class Animal {
    
    String name;
    String type;

    Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}