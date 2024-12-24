public class PersonalInformation {
    
    public static void main(String[] args) {
        
        Person person1 = new Person("John", 25);
        
        person1.display();

    }
}

class Person{

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
