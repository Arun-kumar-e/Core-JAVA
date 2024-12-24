public class BasicConstructor {

    public static void main(String[] args) {
    
        Book book = new Book();
        book.printBook();
    }
}

class Book{

    String title;
    String author;

    Book(){
        title = "Java Programming";
        author = "John Doe";
    }

    void printBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

}