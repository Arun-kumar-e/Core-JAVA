public class Question5 {
    
    public static void main(String[] args) {
        
        Book  b = new Book();
        b.setter("Ikigai", "Japanes", 300);
        b.display();

    }
}

class Book{
    
    private String title;
    private String author;
    private int price;

    void setter(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Title of Book is "+title);
        System.out.println("Author of Book is "+author);
        System.out.println("Price of Book is " + price);
    }


}
