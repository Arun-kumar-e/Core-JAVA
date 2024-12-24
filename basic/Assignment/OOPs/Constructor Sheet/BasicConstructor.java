public class BasicConstructor {

    public static void main(String[] args) {
    
        Book book = new Book("Java Programming", "John Doe");
        book.printBook();
    }
}

class Book{

    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void printBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

}