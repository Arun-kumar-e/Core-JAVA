class ClassA {
    int methodOne(int a) {
        return a * 2;
    }
}

class ClassB {
    int methodOne(int b) {
        return b + 5;
    }
    
    int methodTwo(int b) {
        return b - 3;
    }
}

class ClassC {
    int methodOne(int c) {
        return c * 2;
    }

    int methodTwo(int c) {
        return c + 10;
    }

    int methodThree(int c) {
        return c / 2;
    }
}

class ClassD {
    int methodOne(int d) {
        return d * d;
    }

    int methodTwo(int d) {
        return d - 5;
    }

    int methodThree(int d) {
        return d + 7;
    }

    int methodFour(int d) {
        return d * 3;
    }
}

public class MethodBasicc {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.methodOne(10));

        ClassB b = new ClassB();
        System.out.println(b.methodOne(10));
        System.out.println(b.methodTwo(10));

        ClassC c = new ClassC();
        System.out.println(c.methodOne(10));
        System.out.println(c.methodTwo(10));
        System.out.println(c.methodThree(10));

        ClassD d = new ClassD();
        System.out.println(d.methodOne(10));
        System.out.println(d.methodTwo(10));
        System.out.println(d.methodThree(10));
        System.out.println(d.methodFour(10));
    }
}
