class Book{
    void detail(){
        System.out.println("This is a book");
    }
}

class EBook extends Book{
    void detail(){
        System.out.println("This is an EBook");
    }
}

class PrintedBook extends Book{
    void detail(){
        System.out.println("This is a PrintedBook");
    }
}
public class Q18 {
    public static void main(String[] args) {
        PrintedBook pb = new PrintedBook();
        EBook e = new EBook();
        pb.detail();
        e.detail();
    }
}
