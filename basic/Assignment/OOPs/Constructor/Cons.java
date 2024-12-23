class Const {
    int show(int a) {
        return a;
    }

    long show1(long b) {
        return b;
    }

    float show2(float d) {
        return d;
    }

    short show3(short e) {
        return e;
    }

    char show4(char c) {
        return c;
    }

    byte show5(byte f) {
        return f;
    }

    boolean show6(boolean g) {
        return g;
    }

    double show7(double h) {
        return h;
    }
}

public class Cons {
    public static void main(String[] args) {
        Const c = new Const();
        System.out.println(c.show(10));
        System.out.println(c.show1(10L));
        System.out.println(c.show2(10.0f));
        System.out.println(c.show3((short) 1));
        System.out.println(c.show4('a'));
        System.out.println(c.show5((byte) 1));
        System.out.println(c.show6(true));
        System.out.println(c.show7(10.0));
    }
}
