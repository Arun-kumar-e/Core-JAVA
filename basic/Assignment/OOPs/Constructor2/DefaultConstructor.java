public class DefaultConstructor {
    public static void main(String[] args) {
        Person person = new Person();
        
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}

class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }
}