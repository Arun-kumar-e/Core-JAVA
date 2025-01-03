public class Inheritance11 {
    
    public static void main(String[] args) {
        
        dog d = new dog();
        d.dogSpeak();

        System.out.println();

        cat c = new cat();
        c.catSpeak();

    }
}

class pet{

    void speak(){
        System.out.println("Speaks");
    }

}

class dog extends pet{

    void dogSpeak(){
        System.out.print("Dog ");
        speak();
    }

}

class cat extends pet{

    void catSpeak(){
        System.out.print("Cat ");    
        speak();
    }

}


