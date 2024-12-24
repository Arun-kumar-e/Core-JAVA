public class Books {
    
    public static void main(String[] args) {
        
        boooks b = new boooks("Java Programming");
        b.display();
    }
}

class boooks{

    String title;

    boooks(String title){
        this.title = title;
    }

    void display(){
        System.out.println("Title: " + title);
    }
}
