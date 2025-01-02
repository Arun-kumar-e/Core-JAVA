public class Question9 {
    
    public static void main(String[] args) {
        
        Person p = new Person("Arun", 22);
        p.display(); 
    }
}

class Person{

    String name;
    int age;

    Person( String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name of person is "+ name);
        System.out.println("Age of person is "+ age);
    }
}
