public class Question4 {
    
    public static void main(String[] args) {
        
        Product p = new Product();
        p.setter(100);
        p.price();

        System.out.println( );

       p.setter(-100);
         p.price();
    }
}

class Product{

    private int price;

    void setter(int price){
        this.price = price;
    }


    void price(){
        if (price > 0) {
            System.out.println("Price: " + price);
        } else {
            System.out.println("Invalid amount"); 
        }
    }

}
