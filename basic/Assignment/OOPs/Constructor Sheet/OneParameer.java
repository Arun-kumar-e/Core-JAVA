public class OneParameer{

    public static void main(String[] args) {
        
        BookInf book =new BookInf("Hello java");
        book.show();
    }
}

class BookInf{

    String title;

    BookInf(String title){
        this.title = title;
    }

    void show(){
        System.out.println("title of book is "+ title);
    }
}