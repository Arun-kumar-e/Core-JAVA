public class MethodOverloading3 {
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.display(10);             
        obj.display(10.5);          
        obj.display(5.5f);          
        obj.display('A');           
        obj.display(100000L);       
        obj.display((short) 5);     
        obj.display((byte) 2);      
        obj.display(true);

    }
}

class A{

    void display(int value) {
        System.out.println("Integer value: " + value);
    }

    void display(double value) {
        System.out.println("Double value: " + value);
    }

    void display(float value) {
        System.out.println("Float value: " + value);
    }

    void display(char value) {
        System.out.println("Character value: " + value);
    }

    void display(long value) {
        System.out.println("Long value: " + value);
    }

    void display(short value) {
        System.out.println("Short value: " + value);
    }

    void display(byte value) {
        System.out.println("Byte value: " + value);
    }

    
    void display(boolean value) {
        System.out.println("Boolean value: " + value);
    }

}

