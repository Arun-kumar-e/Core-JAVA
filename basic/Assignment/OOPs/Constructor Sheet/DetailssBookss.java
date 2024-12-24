public class DetailssBookss {
    
    public static void main(String[] args) {
        
        Boooks b = new Boooks("Java", "James Gosling");
        b.display();

    }
}

class Boooks {

    String title;
    String author;

    Boooks(String title, String author){
        this.title = title;
        this.author = author;
    }

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

}
