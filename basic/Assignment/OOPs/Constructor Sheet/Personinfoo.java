public class Personinfoo {
    
    public static void main(String[] args) {
        

        personn p = new personn("Arun Choudhary", 22 );
        p.display();
    }
}

class personn{
    String name;
    int age;

    personn(String name , int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}