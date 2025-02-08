class Pet{
}

class dog extends Pet{
    void pet(){
    System.out.println("Dog is a pet");
   }
}
class cat extends Pet{
    void pet(){
        System.out.println("Cat is a pet");  
    }
}
public class Q13 {
    public static void main(String[] args) {
        dog d = new dog();
        d.pet();
        cat c = new cat();
        c.pet();
    }
}
