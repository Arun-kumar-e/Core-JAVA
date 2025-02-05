interface A{
    private void M1(){
        System.out.println("M1");
    }

    abstract void M2();

    default void M6(){
        M1();
    }

    class B{
        B M3(){
            System.out.println("M3");
            return this;
        }

        protected void M4(){
            System.out.println("M4");
            M5();
        }

        private void M5(){
            System.out.println("M5");
        }
    }
}

class C  extends A.B implements A{
    public void M2(){
            System.out.println("M2");
        }
}
public class Q6 {
    public static void main(String[] args) {
        C c = new C();
        c.M6();
        c.M2();
        c.M3();
        c.M4();        
    }
}
