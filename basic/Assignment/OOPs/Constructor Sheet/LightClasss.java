public class LightClasss {
    
    public static void main(String[] args) {
        
        Light l = new Light();
        l.display();

    }
}

class Light{

    boolean isOn;

    Light(){
        isOn = true;
    }

    void display(){
        System.out.println("Light is on: "+isOn);
    }

}
