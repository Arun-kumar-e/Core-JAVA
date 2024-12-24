public class InheritanceofDifferentM {
    public static void main(String[] args) {
        
        In obj = new In();
        obj.d();
    }
}

class In{
    void a(){
        System.out.println("First method");
    }

    void b(){
        a();
    }

    void c(){
        b();
    }

    void d(){
        c();
    }
}