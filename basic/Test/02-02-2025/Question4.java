public class Question4 {
    
    public static void main(String[] args) {
        
        Product p = new Product();
        p.price(455);

        System.out.println( );
        
        p.price(-55);
    }
}

class Product{

    void price(int price){
        if (price > 0) {
            System.out.println("Price: " + price);
        } else {
            System.out.println("Invalid amount"); 
        }
    }

}
