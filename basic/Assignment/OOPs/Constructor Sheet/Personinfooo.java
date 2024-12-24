public class Personinfooo {
    
    public static void main(String[] args) {
        
        Perason p = new Perason();
        p.display();
    }
}

class Perason{
    
    String name;
    int age;
    
    public Perason(){
        name = "John";
        age = 25;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
