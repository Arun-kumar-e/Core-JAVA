public class Inheritance2 {
    
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.name("Dog");
        d.age(2);
        d.display();

    }
}

class Mammal {
    
    String name;
    int age;
    
    void name(String name) {
        this.name = name;
    }
    
    void age(int age) {
        this.age = age;
    }
    
}

class Dog extends Mammal {
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}


