public class BookDetails {
    
    public static void main(String[] args) {
        
        Details d = new Details("Java", "James Gosling", 500);
        d.display();
        
    
    }
}

class Details{

    String title;
    String author;
    int price;

    public Details(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
