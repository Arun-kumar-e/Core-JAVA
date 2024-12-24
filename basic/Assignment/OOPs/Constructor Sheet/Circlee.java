public class Circlee {
    
    public static void main(String[] args) {
        
        Circllee c = new Circllee(5.5f);
        
        c.display();
    }
}

class Circllee {

    float radius;

    Circllee(float radius){
        this.radius = radius;
    }

    void display(){
        System.out.println("Radius: "+radius);
    }

}
